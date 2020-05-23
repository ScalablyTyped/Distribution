package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a misspelled interval.
  */
trait MisspelledInterval extends js.Object {
  /**
    * Gets the spelling error type.
    */
  val errorType: SpellingErrorType
  /**
    * Gets the text buffer interval occupied by the current element.
    */
  val interval: Interval
  /**
    * Gets the length of the misspelled interval.
    */
  val length: Double
  /**
    * Gets the start position of the misspelled word in the interval.
    */
  val start: Double
  /**
    * Gets a list of suggested words to replace the misspelled word.
    */
  val suggestions: js.Array[String]
  /**
    * Gets an erroneous word found during spell check.
    */
  val word: String
}

object MisspelledInterval {
  @scala.inline
  def apply(
    errorType: SpellingErrorType,
    interval: Interval,
    length: Double,
    start: Double,
    suggestions: js.Array[String],
    word: String
  ): MisspelledInterval = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[MisspelledInterval]
  }
}

