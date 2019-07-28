package typings.gapiDotClientDotGamesconfiguration.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesNumberFormatConfiguration extends js.Object {
  /** The curreny code string. Only used for CURRENCY format type. */
  var currencyCode: js.UndefOr[String] = js.undefined
  /** The number of decimal places for number. Only used for NUMERIC format type. */
  var numDecimalPlaces: js.UndefOr[Double] = js.undefined
  /**
    * The formatting for the number.
    * Possible values are:
    * - "NUMERIC" - Numbers are formatted to have no digits or a fixed number of digits after the decimal point according to locale. An optional custom unit
    * can be added.
    * - "TIME_DURATION" - Numbers are formatted to hours, minutes and seconds.
    * - "CURRENCY" - Numbers are formatted to currency according to locale.
    */
  var numberFormatType: js.UndefOr[String] = js.undefined
  /** An optional suffix for the NUMERIC format type. These strings follow the same  plural rules as all Android string resources. */
  var suffix: js.UndefOr[GamesNumberAffixConfiguration] = js.undefined
}

object GamesNumberFormatConfiguration {
  @scala.inline
  def apply(
    currencyCode: String = null,
    numDecimalPlaces: Int | Double = null,
    numberFormatType: String = null,
    suffix: GamesNumberAffixConfiguration = null
  ): GamesNumberFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    if (numDecimalPlaces != null) __obj.updateDynamic("numDecimalPlaces")(numDecimalPlaces.asInstanceOf[js.Any])
    if (numberFormatType != null) __obj.updateDynamic("numberFormatType")(numberFormatType)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[GamesNumberFormatConfiguration]
  }
}

