package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatDigitInternalSlots extends js.Object {
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  var minimumIntegerDigits: Double
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  var notation: js.UndefOr[NumberFormatNotation] = js.undefined
  var roundingType: NumberFormatRoundingType
}

object NumberFormatDigitInternalSlots {
  @scala.inline
  def apply(
    minimumIntegerDigits: Double,
    roundingType: NumberFormatRoundingType,
    maximumFractionDigits: js.UndefOr[Double] = js.undefined,
    maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
    minimumFractionDigits: js.UndefOr[Double] = js.undefined,
    minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
    notation: NumberFormatNotation = null
  ): NumberFormatDigitInternalSlots = {
    val __obj = js.Dynamic.literal(minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFractionDigits)) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFractionDigits)) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.get.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatDigitInternalSlots]
  }
}

