package typings.gapiDotClientDotGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesNumberAffixConfiguration extends js.Object {
  /**
    * When the language requires special treatment of "small" numbers (as with 2, 3, and 4 in Czech; or numbers ending 2, 3, or 4 but not 12, 13, or 14 in
    * Polish).
    */
  var few: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** When the language requires special treatment of "large" numbers (as with numbers ending 11-99 in Maltese). */
  var many: js.UndefOr[LocalizedStringBundle] = js.undefined
  /**
    * When the language requires special treatment of numbers like one (as with the number 1 in English and most other languages; in Russian, any number
    * ending in 1 but not ending in 11 is in this class).
    */
  var one: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** When the language does not require special treatment of the given quantity (as with all numbers in Chinese, or 42 in English). */
  var other: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** When the language requires special treatment of numbers like two (as with 2 in Welsh, or 102 in Slovenian). */
  var two: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** When the language requires special treatment of the number 0 (as in Arabic). */
  var zero: js.UndefOr[LocalizedStringBundle] = js.undefined
}

object GamesNumberAffixConfiguration {
  @scala.inline
  def apply(
    few: LocalizedStringBundle = null,
    many: LocalizedStringBundle = null,
    one: LocalizedStringBundle = null,
    other: LocalizedStringBundle = null,
    two: LocalizedStringBundle = null,
    zero: LocalizedStringBundle = null
  ): GamesNumberAffixConfiguration = {
    val __obj = js.Dynamic.literal()
    if (few != null) __obj.updateDynamic("few")(few)
    if (many != null) __obj.updateDynamic("many")(many)
    if (one != null) __obj.updateDynamic("one")(one)
    if (other != null) __obj.updateDynamic("other")(other)
    if (two != null) __obj.updateDynamic("two")(two)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[GamesNumberAffixConfiguration]
  }
}

