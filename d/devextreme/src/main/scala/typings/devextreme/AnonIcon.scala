package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonIcon {
  @scala.inline
  def apply(icon: String = null, text: String = null): AnonIcon = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

