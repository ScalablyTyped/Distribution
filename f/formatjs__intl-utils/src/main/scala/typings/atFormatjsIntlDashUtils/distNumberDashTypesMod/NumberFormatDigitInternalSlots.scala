package typings.atFormatjsIntlDashUtils.distNumberDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatDigitInternalSlots extends js.Object {
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  var minimumIntegerDigits: Double
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  var roundingType: NumberFormatRoundingType
}

object NumberFormatDigitInternalSlots {
  @scala.inline
  def apply(
    minimumIntegerDigits: Double,
    roundingType: NumberFormatRoundingType,
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null
  ): NumberFormatDigitInternalSlots = {
    val __obj = js.Dynamic.literal(minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatDigitInternalSlots]
  }
}

