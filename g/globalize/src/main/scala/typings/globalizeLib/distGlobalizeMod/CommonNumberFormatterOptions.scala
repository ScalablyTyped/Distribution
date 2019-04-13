package typings
package globalizeLib.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonNumberFormatterOptions extends js.Object {
  /**
  		 * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
  		 * Numbers will be rounded or padded with trailing zeroes if necessary.
  		 * Either one or both of these properties must be present.
  		 * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
  		 */
  var maximumFractionDigits: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
  		 * Either none or both of these properties are present.
  		 * If they are, they override minimum and maximum integer and fraction digits.
  		 * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
  		 */
  var maximumSignificantDigits: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
  		 * Numbers will be rounded or padded with trailing zeroes if necessary.
  		 * Either one or both of these properties must be present.
  		 * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
  		 */
  var minimumFractionDigits: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
  		 */
  var minimumIntegerDigits: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
  		 * Either none or both of these properties are present
  		 * If they are, they override minimum and maximum integer and fraction digits.
  		 * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
  		 */
  var minimumSignificantDigits: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * String with rounding method ceil, floor, round (default), or truncate.
  		 */
  var round: js.UndefOr[
    globalizeLib.globalizeLibStrings.ceil | globalizeLib.globalizeLibStrings.floor | globalizeLib.globalizeLibStrings.round | globalizeLib.globalizeLibStrings.truncate
  ] = js.undefined
  /**
  		 * Boolean (default is true) value indicating whether a grouping separator should be used.
  		 */
  var useGrouping: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonNumberFormatterOptions {
  @scala.inline
  def apply(
    maximumFractionDigits: scala.Int | scala.Double = null,
    maximumSignificantDigits: scala.Int | scala.Double = null,
    minimumFractionDigits: scala.Int | scala.Double = null,
    minimumIntegerDigits: scala.Int | scala.Double = null,
    minimumSignificantDigits: scala.Int | scala.Double = null,
    round: globalizeLib.globalizeLibStrings.ceil | globalizeLib.globalizeLibStrings.floor | globalizeLib.globalizeLibStrings.round | globalizeLib.globalizeLibStrings.truncate = null,
    useGrouping: js.UndefOr[scala.Boolean] = js.undefined
  ): CommonNumberFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[CommonNumberFormatterOptions]
  }
}

