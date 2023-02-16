package com.example.motivationalquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motivationalquotes.databinding.ActivityQuotesBinding

class QuotesDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}