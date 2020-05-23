package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeView
import typings.devextreme.mod.DevExpress.ui.dxTreeViewNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementItemElement extends js.Object {
  var component: js.UndefOr[dxTreeView] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var node: js.UndefOr[dxTreeViewNode] = js.undefined
}

object ElementItemElement {
  @scala.inline
  def apply(
    component: dxTreeView = null,
    element: dxElement = null,
    itemElement: dxElement = null,
    model: js.Any = null,
    node: dxTreeViewNode = null
  ): ElementItemElement = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementItemElement]
  }
}

