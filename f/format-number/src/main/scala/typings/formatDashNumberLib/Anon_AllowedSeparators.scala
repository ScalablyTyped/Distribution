package typings
package formatDashNumberLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedSeparators extends js.Object {
  var allowedSeparators: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  var decimalsSeparator: js.UndefOr[java.lang.String] = js.undefined
  var integerSeparator: js.UndefOr[java.lang.String] = js.undefined
  var negative: js.UndefOr[formatDashNumberLib.formatDashNumberLibStrings.R | scala.Null] = js.undefined
  var negativeLeftOut: js.UndefOr[scala.Boolean] = js.undefined
  var negativeLeftSymbol: js.UndefOr[java.lang.String] = js.undefined
  var negativeOut: js.UndefOr[scala.Boolean] = js.undefined
  var negativeRightSymbol: js.UndefOr[java.lang.String] = js.undefined
  var negativeType: js.UndefOr[
    formatDashNumberLib.formatDashNumberLibStrings.right | formatDashNumberLib.formatDashNumberLibStrings.left | formatDashNumberLib.formatDashNumberLibStrings.brackets | scala.Null
  ] = js.undefined
  var padLeft: js.UndefOr[scala.Double] = js.undefined
  var padRight: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var round: js.UndefOr[scala.Double] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  var truncate: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AllowedSeparators {
  @scala.inline
  def apply(
    allowedSeparators: js.Array[java.lang.String] = null,
    decimal: java.lang.String = null,
    decimalsSeparator: java.lang.String = null,
    integerSeparator: java.lang.String = null,
    negative: formatDashNumberLib.formatDashNumberLibStrings.R = null,
    negativeLeftOut: js.UndefOr[scala.Boolean] = js.undefined,
    negativeLeftSymbol: java.lang.String = null,
    negativeOut: js.UndefOr[scala.Boolean] = js.undefined,
    negativeRightSymbol: java.lang.String = null,
    negativeType: formatDashNumberLib.formatDashNumberLibStrings.right | formatDashNumberLib.formatDashNumberLibStrings.left | formatDashNumberLib.formatDashNumberLibStrings.brackets = null,
    padLeft: scala.Int | scala.Double = null,
    padRight: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    round: scala.Int | scala.Double = null,
    separator: java.lang.String = null,
    suffix: java.lang.String = null,
    truncate: scala.Int | scala.Double = null
  ): Anon_AllowedSeparators = {
    val __obj = js.Dynamic.literal()
    if (allowedSeparators != null) __obj.updateDynamic("allowedSeparators")(allowedSeparators)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (decimalsSeparator != null) __obj.updateDynamic("decimalsSeparator")(decimalsSeparator)
    if (integerSeparator != null) __obj.updateDynamic("integerSeparator")(integerSeparator)
    if (negative != null) __obj.updateDynamic("negative")(negative)
    if (!js.isUndefined(negativeLeftOut)) __obj.updateDynamic("negativeLeftOut")(negativeLeftOut)
    if (negativeLeftSymbol != null) __obj.updateDynamic("negativeLeftSymbol")(negativeLeftSymbol)
    if (!js.isUndefined(negativeOut)) __obj.updateDynamic("negativeOut")(negativeOut)
    if (negativeRightSymbol != null) __obj.updateDynamic("negativeRightSymbol")(negativeRightSymbol)
    if (negativeType != null) __obj.updateDynamic("negativeType")(negativeType.asInstanceOf[js.Any])
    if (padLeft != null) __obj.updateDynamic("padLeft")(padLeft.asInstanceOf[js.Any])
    if (padRight != null) __obj.updateDynamic("padRight")(padRight.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedSeparators]
  }
}

