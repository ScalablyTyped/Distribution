package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DropDown
trait DropDownIcons extends js.Object {
  var dropdown: js.UndefOr[String] = js.undefined
}

object DropDownIcons {
  @scala.inline
  def apply(dropdown: String = null): DropDownIcons = {
    val __obj = js.Dynamic.literal()
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownIcons]
  }
}

