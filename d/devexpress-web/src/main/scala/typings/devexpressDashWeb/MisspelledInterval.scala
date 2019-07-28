package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a misspelled interval.
  */
trait MisspelledInterval extends js.Object {
  /**
    * Gets the spelling error type.
    * Value: One of the <see cref="SpellingErrorType" /> enumeration values.
    */
  var errorType: js.Any
  /**
    * Gets the text buffer interval occupied by the current element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the length of the misspelled interval.
    * Value: An integer value specifying the misspelled interval's length.
    */
  var length: Double
  /**
    * Gets the start position of the misspelled word in the interval.
    * Value: An integer value specifying the misspelled word's start position.
    */
  var start: Double
  /**
    * Gets a list of suggested words to replace the misspelled word.
    * Value: A string array containing suggested words.
    */
  var suggestions: js.Array[String]
  /**
    * Gets an erroneous word found during spell check.
    * Value: A string that is the erroneous or misspelled word.
    */
  var word: String
}

object MisspelledInterval {
  @scala.inline
  def apply(
    errorType: js.Any,
    interval: Interval,
    length: Double,
    start: Double,
    suggestions: js.Array[String],
    word: String
  ): MisspelledInterval = {
    val __obj = js.Dynamic.literal(errorType = errorType, interval = interval, length = length, start = start, suggestions = suggestions, word = word)
  
    __obj.asInstanceOf[MisspelledInterval]
  }
}

