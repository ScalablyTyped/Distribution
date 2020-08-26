package typings.formatjsIntlUtils.anon

import typings.formatjsIntlUtils.srcNumberTypesMod.NumberFormatRoundingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-utils.@formatjs/intl-utils/src/number-types.NumberFormatDigitInternalSlots, 'roundingType' | 'minimumSignificantDigits' | 'maximumSignificantDigits' | 'minimumIntegerDigits' | 'minimumFractionDigits' | 'maximumFractionDigits'> */
@js.native
trait PickNumberFormatDigitInte extends js.Object {
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  var minimumIntegerDigits: Double = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var roundingType: NumberFormatRoundingType = js.native
}

object PickNumberFormatDigitInte {
  @scala.inline
  def apply(minimumIntegerDigits: Double, roundingType: NumberFormatRoundingType): PickNumberFormatDigitInte = {
    val __obj = js.Dynamic.literal(minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNumberFormatDigitInte]
  }
  @scala.inline
  implicit class PickNumberFormatDigitInteOps[Self <: PickNumberFormatDigitInte] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundingType(value: NumberFormatRoundingType): Self = this.set("roundingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFractionDigits: Self = this.set("maximumFractionDigits", js.undefined)
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = this.set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumSignificantDigits: Self = this.set("maximumSignificantDigits", js.undefined)
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFractionDigits: Self = this.set("minimumFractionDigits", js.undefined)
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
  }
  
}

