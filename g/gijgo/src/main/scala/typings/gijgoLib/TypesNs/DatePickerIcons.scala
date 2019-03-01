package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DatePicker
trait DatePickerIcons extends js.Object {
  var rightIcon: js.UndefOr[java.lang.String] = js.undefined
}

object DatePickerIcons {
  @scala.inline
  def apply(rightIcon: java.lang.String = null): DatePickerIcons = {
    val __obj = js.Dynamic.literal()
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    __obj.asInstanceOf[DatePickerIcons]
  }
}

