package typings.formatDashNumber

import typings.formatDashNumber.formatDashNumberStrings.R
import typings.formatDashNumber.formatDashNumberStrings.brackets
import typings.formatDashNumber.formatDashNumberStrings.left
import typings.formatDashNumber.formatDashNumberStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedSeparators extends js.Object {
  var allowedSeparators: js.UndefOr[js.Array[String]] = js.undefined
  var decimal: js.UndefOr[String] = js.undefined
  var decimalsSeparator: js.UndefOr[String] = js.undefined
  var integerSeparator: js.UndefOr[String] = js.undefined
  var negative: js.UndefOr[R | Null] = js.undefined
  var negativeLeftOut: js.UndefOr[Boolean] = js.undefined
  var negativeLeftSymbol: js.UndefOr[String] = js.undefined
  var negativeOut: js.UndefOr[Boolean] = js.undefined
  var negativeRightSymbol: js.UndefOr[String] = js.undefined
  var negativeType: js.UndefOr[right | left | brackets | Null] = js.undefined
  var padLeft: js.UndefOr[Double] = js.undefined
  var padRight: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var round: js.UndefOr[Double] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var truncate: js.UndefOr[Double] = js.undefined
}

object Anon_AllowedSeparators {
  @scala.inline
  def apply(
    allowedSeparators: js.Array[String] = null,
    decimal: String = null,
    decimalsSeparator: String = null,
    integerSeparator: String = null,
    negative: R = null,
    negativeLeftOut: js.UndefOr[Boolean] = js.undefined,
    negativeLeftSymbol: String = null,
    negativeOut: js.UndefOr[Boolean] = js.undefined,
    negativeRightSymbol: String = null,
    negativeType: right | left | brackets = null,
    padLeft: Int | Double = null,
    padRight: Int | Double = null,
    prefix: String = null,
    round: Int | Double = null,
    separator: String = null,
    suffix: String = null,
    truncate: Int | Double = null
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

