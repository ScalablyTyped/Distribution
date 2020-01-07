package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a number affix resource.
  */
@js.native
trait Schema$GamesNumberAffixConfiguration extends js.Object {
  /**
    * When the language requires special treatment of &quot;small&quot; numbers
    * (as with 2, 3, and 4 in Czech; or numbers ending 2, 3, or 4 but not 12,
    * 13, or 14 in Polish).
    */
  var few: js.UndefOr[Schema$LocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of &quot;large&quot; numbers
    * (as with numbers ending 11-99 in Maltese).
    */
  var many: js.UndefOr[Schema$LocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of numbers like one (as with
    * the number 1 in English and most other languages; in Russian, any number
    * ending in 1 but not ending in 11 is in this class).
    */
  var one: js.UndefOr[Schema$LocalizedStringBundle] = js.native
  /**
    * When the language does not require special treatment of the given
    * quantity (as with all numbers in Chinese, or 42 in English).
    */
  var other: js.UndefOr[Schema$LocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of numbers like two (as with
    * 2 in Welsh, or 102 in Slovenian).
    */
  var two: js.UndefOr[Schema$LocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of the number 0 (as in
    * Arabic).
    */
  var zero: js.UndefOr[Schema$LocalizedStringBundle] = js.native
}

object Schema$GamesNumberAffixConfiguration {
  @scala.inline
  def apply(
    few: Schema$LocalizedStringBundle = null,
    many: Schema$LocalizedStringBundle = null,
    one: Schema$LocalizedStringBundle = null,
    other: Schema$LocalizedStringBundle = null,
    two: Schema$LocalizedStringBundle = null,
    zero: Schema$LocalizedStringBundle = null
  ): Schema$GamesNumberAffixConfiguration = {
    val __obj = js.Dynamic.literal()
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GamesNumberAffixConfiguration]
  }
}

