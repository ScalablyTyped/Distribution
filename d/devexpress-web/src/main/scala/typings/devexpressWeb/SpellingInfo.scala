package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains spell checking related settings.
  */
trait SpellingInfo extends js.Object {
  /**
    * Provides access to an array containing misspelled intervals.
    */
  val misspelledIntervals: js.Array[MisspelledInterval]
  /**
    * Gets a value specifying the spell checking state.
    */
  val spellCheckerState: SpellCheckerState
}

object SpellingInfo {
  @scala.inline
  def apply(misspelledIntervals: js.Array[MisspelledInterval], spellCheckerState: SpellCheckerState): SpellingInfo = {
    val __obj = js.Dynamic.literal(misspelledIntervals = misspelledIntervals.asInstanceOf[js.Any], spellCheckerState = spellCheckerState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingInfo]
  }
}

