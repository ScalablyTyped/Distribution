package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawNumberFormatResult extends js.Object {
  var formattedString: String = js.native
  var integerDigitsCount: Double = js.native
  var roundedNumber: Double = js.native
}

object RawNumberFormatResult {
  @scala.inline
  def apply(formattedString: String, integerDigitsCount: Double, roundedNumber: Double): RawNumberFormatResult = {
    val __obj = js.Dynamic.literal(formattedString = formattedString.asInstanceOf[js.Any], integerDigitsCount = integerDigitsCount.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNumberFormatResult]
  }
  @scala.inline
  implicit class RawNumberFormatResultOps[Self <: RawNumberFormatResult] (val x: Self) extends AnyVal {
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
    def setFormattedString(value: String): Self = this.set("formattedString", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegerDigitsCount(value: Double): Self = this.set("integerDigitsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundedNumber(value: Double): Self = this.set("roundedNumber", value.asInstanceOf[js.Any])
  }
  
}

