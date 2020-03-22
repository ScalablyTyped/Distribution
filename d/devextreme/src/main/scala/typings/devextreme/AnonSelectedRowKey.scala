package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxGantt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectedRowKey extends js.Object {
  var component: js.UndefOr[dxGantt] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var selectedRowKey: js.UndefOr[js.Any] = js.undefined
}

object AnonSelectedRowKey {
  @scala.inline
  def apply(
    component: dxGantt = null,
    element: dxElement = null,
    model: js.Any = null,
    selectedRowKey: js.Any = null
  ): AnonSelectedRowKey = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (selectedRowKey != null) __obj.updateDynamic("selectedRowKey")(selectedRowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectedRowKey]
  }
}

