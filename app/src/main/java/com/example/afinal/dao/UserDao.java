package com.example.afinal.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.afinal.entity.User;

@Dao
public interface UserDao {
    @Insert
    void insert(User user);

    @Query("SELECT * FROM users WHERE user_name = :username")
    User findByUsername(String username);

    @Query("SELECT nick_name FROM users WHERE user_name = :username")
    String getNickNameByUsername(String username);
}