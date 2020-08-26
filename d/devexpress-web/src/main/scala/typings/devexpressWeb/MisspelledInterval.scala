package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a misspelled interval.
  */
@js.native
trait MisspelledInterval extends js.Object {
  /**
    * Gets the spelling error type.
    */
  val errorType: SpellingErrorType = js.native
  /**
    * Gets the text buffer interval occupied by the current element.
    */
  val interval: Interval = js.native
  /**
    * Gets the length of the misspelled interval.
    */
  val length: Double = js.native
  /**
    * Gets the start position of the misspelled word in the interval.
    */
  val start: Double = js.native
  /**
    * Gets a list of suggested words to replace the misspelled word.
    */
  val suggestions: js.Array[String] = js.native
  /**
    * Gets an erroneous word found during spell check.
    */
  val word: String = js.native
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
  @scala.inline
  implicit class MisspelledIntervalOps[Self <: MisspelledInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorType(value: SpellingErrorType): Self = this.set("errorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
  }
  
}

