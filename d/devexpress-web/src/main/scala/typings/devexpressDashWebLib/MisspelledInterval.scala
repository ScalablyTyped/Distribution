package typings
package devexpressDashWebLib

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
  var length: scala.Double
  /**
    * Gets the start position of the misspelled word in the interval.
    * Value: An integer value specifying the misspelled word's start position.
    */
  var start: scala.Double
  /**
    * Gets a list of suggested words to replace the misspelled word.
    * Value: A string array containing suggested words.
    */
  var suggestions: js.Array[java.lang.String]
  /**
    * Gets an erroneous word found during spell check.
    * Value: A string that is the erroneous or misspelled word.
    */
  var word: java.lang.String
}

object MisspelledInterval {
  @scala.inline
  def apply(
    errorType: js.Any,
    interval: Interval,
    length: scala.Double,
    start: scala.Double,
    suggestions: js.Array[java.lang.String],
    word: java.lang.String
  ): MisspelledInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorType")(errorType)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("suggestions")(suggestions)
    __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[MisspelledInterval]
  }
}

