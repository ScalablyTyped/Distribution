package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains spell checking related settings.
  */
@JSGlobal("SpellingInfo")
@js.native
class SpellingInfo ()
  extends typings.devexpressWeb.SpellingInfo {
  /**
    * Provides access to an array containing misspelled intervals.
    */
  /* CompleteClass */
  override val misspelledIntervals: js.Array[typings.devexpressWeb.MisspelledInterval] = js.native
  /**
    * Gets a value specifying the spell checking state.
    */
  /* CompleteClass */
  override val spellCheckerState: typings.devexpressWeb.SpellCheckerState = js.native
}

