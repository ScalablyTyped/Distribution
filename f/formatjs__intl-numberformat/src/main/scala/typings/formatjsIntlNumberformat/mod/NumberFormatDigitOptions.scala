package typings.formatjsIntlNumberformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormatDigitOptions extends js.Object {
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
}

object NumberFormatDigitOptions {
  @scala.inline
  def apply(): NumberFormatDigitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatDigitOptions]
  }
  @scala.inline
  implicit class NumberFormatDigitOptionsOps[Self <: NumberFormatDigitOptions] (val x: Self) extends AnyVal {
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
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumIntegerDigits: Self = this.set("minimumIntegerDigits", js.undefined)
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
  }
  
}

