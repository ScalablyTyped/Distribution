package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains spell checking related settings.
  */
trait SpellingInfo extends js.Object {
  /**
    * Provides access to an array containing misspelled intervals.
    * Value: An array of MisspelledInterval objects.
    */
  var misspelledIntervals: js.Array[MisspelledInterval]
  /**
    * Gets a value specifying the spell checking state.
    * Value: One of the <see cref="SpellCheckerState" /> enumeration values.
    */
  var spellCheckerState: js.Any
}

object SpellingInfo {
  @scala.inline
  def apply(misspelledIntervals: js.Array[MisspelledInterval], spellCheckerState: js.Any): SpellingInfo = {
    val __obj = js.Dynamic.literal(misspelledIntervals = misspelledIntervals, spellCheckerState = spellCheckerState)
  
    __obj.asInstanceOf[SpellingInfo]
  }
}

