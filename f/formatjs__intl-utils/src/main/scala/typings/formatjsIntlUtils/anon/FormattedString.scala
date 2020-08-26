package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedString extends js.Object {
  var formattedString: String = js.native
  var roundedNumber: Double = js.native
}

object FormattedString {
  @scala.inline
  def apply(formattedString: String, roundedNumber: Double): FormattedString = {
    val __obj = js.Dynamic.literal(formattedString = formattedString.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedString]
  }
  @scala.inline
  implicit class FormattedStringOps[Self <: FormattedString] (val x: Self) extends AnyVal {
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
    def setRoundedNumber(value: Double): Self = this.set("roundedNumber", value.asInstanceOf[js.Any])
  }
  
}

