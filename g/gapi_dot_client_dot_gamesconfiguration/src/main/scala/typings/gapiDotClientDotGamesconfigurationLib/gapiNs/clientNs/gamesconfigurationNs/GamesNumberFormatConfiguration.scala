package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesNumberFormatConfiguration extends js.Object {
  /** The curreny code string. Only used for CURRENCY format type. */
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
  /** The number of decimal places for number. Only used for NUMERIC format type. */
  var numDecimalPlaces: js.UndefOr[scala.Double] = js.undefined
  /**
    * The formatting for the number.
    * Possible values are:
    * - "NUMERIC" - Numbers are formatted to have no digits or a fixed number of digits after the decimal point according to locale. An optional custom unit
    * can be added.
    * - "TIME_DURATION" - Numbers are formatted to hours, minutes and seconds.
    * - "CURRENCY" - Numbers are formatted to currency according to locale.
    */
  var numberFormatType: js.UndefOr[java.lang.String] = js.undefined
  /** An optional suffix for the NUMERIC format type. These strings follow the same  plural rules as all Android string resources. */
  var suffix: js.UndefOr[GamesNumberAffixConfiguration] = js.undefined
}

