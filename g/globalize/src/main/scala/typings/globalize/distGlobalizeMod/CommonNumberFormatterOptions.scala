package typings.globalize.distGlobalizeMod

import typings.globalize.globalizeStrings.ceil
import typings.globalize.globalizeStrings.floor
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.round
import typings.globalize.globalizeStrings.short
import typings.globalize.globalizeStrings.truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonNumberFormatterOptions extends js.Object {
  /**
  		 * String `short` or `long` indicating which compact number format should be used to represent the number.
  		 */
  var compact: js.UndefOr[short | long] = js.undefined
  /**
  		 * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
  		 * Numbers will be rounded or padded with trailing zeroes if necessary.
  		 * Either one or both of these properties must be present.
  		 * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
  		 */
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  /**
  		 * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
  		 * Either none or both of these properties are present.
  		 * If they are, they override minimum and maximum integer and fraction digits.
  		 * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
  		 */
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  /**
  		 * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
  		 * Numbers will be rounded or padded with trailing zeroes if necessary.
  		 * Either one or both of these properties must be present.
  		 * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
  		 */
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  /**
  		 * Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
  		 */
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  /**
  		 * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
  		 * Either none or both of these properties are present
  		 * If they are, they override minimum and maximum integer and fraction digits.
  		 * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
  		 */
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  /**
  		 * String with rounding method ceil, floor, round (default), or truncate.
  		 */
  var round: js.UndefOr[ceil | floor | typings.globalize.globalizeStrings.round | truncate] = js.undefined
  /**
  		 * Boolean (default is true) value indicating whether a grouping separator should be used.
  		 */
  var useGrouping: js.UndefOr[Boolean] = js.undefined
}

object CommonNumberFormatterOptions {
  @scala.inline
  def apply(
    compact: short | long = null,
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumIntegerDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    round: ceil | floor | round | truncate = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): CommonNumberFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonNumberFormatterOptions]
  }
}

