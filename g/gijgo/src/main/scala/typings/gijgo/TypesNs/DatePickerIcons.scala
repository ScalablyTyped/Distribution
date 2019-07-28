package typings.gijgo.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DatePicker
trait DatePickerIcons extends js.Object {
  var rightIcon: js.UndefOr[String] = js.undefined
}

object DatePickerIcons {
  @scala.inline
  def apply(rightIcon: String = null): DatePickerIcons = {
    val __obj = js.Dynamic.literal()
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    __obj.asInstanceOf[DatePickerIcons]
  }
}

