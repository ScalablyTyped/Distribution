package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DatePicker
@js.native
trait DatePickerIcons extends js.Object {
  var rightIcon: js.UndefOr[String] = js.native
}

object DatePickerIcons {
  @scala.inline
  def apply(): DatePickerIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerIcons]
  }
  @scala.inline
  implicit class DatePickerIconsOps[Self <: DatePickerIcons] (val x: Self) extends AnyVal {
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
    def setRightIcon(value: String): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
  }
  
}

