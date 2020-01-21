package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a misspelled interval.
  */
@JSGlobal("MisspelledInterval")
@js.native
class MisspelledInterval () extends js.Object {
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

