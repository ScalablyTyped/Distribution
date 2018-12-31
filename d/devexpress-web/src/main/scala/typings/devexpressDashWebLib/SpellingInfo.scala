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

