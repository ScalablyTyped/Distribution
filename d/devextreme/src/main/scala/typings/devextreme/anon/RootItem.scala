package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootItem extends js.Object {
  var component: js.UndefOr[dxMenu] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var rootItem: js.UndefOr[dxElement] = js.undefined
}

object RootItem {
  @scala.inline
  def apply(
    component: dxMenu = null,
    element: dxElement = null,
    model: js.Any = null,
    rootItem: dxElement = null
  ): RootItem = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (rootItem != null) __obj.updateDynamic("rootItem")(rootItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootItem]
  }
}

