package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a number format resource.
  */
@js.native
trait Schema$GamesNumberFormatConfiguration extends js.Object {
  /**
    * The curreny code string. Only used for CURRENCY format type.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * The number of decimal places for number. Only used for NUMERIC format
    * type.
    */
  var numDecimalPlaces: js.UndefOr[Double] = js.native
  /**
    * The formatting for the number. Possible values are:   -
    * &quot;NUMERIC&quot; - Numbers are formatted to have no digits or a fixed
    * number of digits after the decimal point according to locale. An optional
    * custom unit can be added. - &quot;TIME_DURATION&quot; - Numbers are
    * formatted to hours, minutes and seconds. - &quot;CURRENCY&quot; - Numbers
    * are formatted to currency according to locale.
    */
  var numberFormatType: js.UndefOr[String] = js.native
  /**
    * An optional suffix for the NUMERIC format type. These strings follow the
    * same  plural rules as all Android string resources.
    */
  var suffix: js.UndefOr[Schema$GamesNumberAffixConfiguration] = js.native
}

object Schema$GamesNumberFormatConfiguration {
  @scala.inline
  def apply(
    currencyCode: String = null,
    numDecimalPlaces: Int | Double = null,
    numberFormatType: String = null,
    suffix: Schema$GamesNumberAffixConfiguration = null
  ): Schema$GamesNumberFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (numDecimalPlaces != null) __obj.updateDynamic("numDecimalPlaces")(numDecimalPlaces.asInstanceOf[js.Any])
    if (numberFormatType != null) __obj.updateDynamic("numberFormatType")(numberFormatType.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GamesNumberFormatConfiguration]
  }
}

