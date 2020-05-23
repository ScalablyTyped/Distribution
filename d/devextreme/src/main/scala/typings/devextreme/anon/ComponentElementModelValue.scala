package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentElementModelValue extends js.Object {
  var component: js.UndefOr[dxTreeView] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[Boolean] = js.undefined
}

object ComponentElementModelValue {
  @scala.inline
  def apply(
    component: dxTreeView = null,
    element: dxElement = null,
    model: js.Any = null,
    value: js.UndefOr[Boolean] = js.undefined
  ): ComponentElementModelValue = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElementModelValue]
  }
}

