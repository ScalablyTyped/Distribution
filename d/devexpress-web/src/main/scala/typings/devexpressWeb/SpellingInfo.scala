package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains spell checking related settings.
  */
@JSGlobal("SpellingInfo")
@js.native
class SpellingInfo () extends js.Object {
  /**
    * Provides access to an array containing misspelled intervals.
    */
  val misspelledIntervals: js.Array[MisspelledInterval] = js.native
  /**
    * Gets a value specifying the spell checking state.
    */
  val spellCheckerState: SpellCheckerState = js.native
}

