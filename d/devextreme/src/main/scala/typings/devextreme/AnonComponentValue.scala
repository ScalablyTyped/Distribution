package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxDropDownBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentValue extends js.Object {
  var component: js.UndefOr[dxDropDownBox] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonComponentValue {
  @scala.inline
  def apply(component: dxDropDownBox = null, value: js.Any = null): AnonComponentValue = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentValue]
  }
}

