package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxFunnel
import typings.devextreme.mod.DevExpress.viz.dxFunnelItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementItem extends js.Object {
  var component: js.UndefOr[dxFunnel] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var item: js.UndefOr[dxFunnelItem] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object ElementItem {
  @scala.inline
  def apply(
    component: dxFunnel = null,
    element: dxElement = null,
    item: dxFunnelItem = null,
    model: js.Any = null
  ): ElementItem = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementItem]
  }
}

