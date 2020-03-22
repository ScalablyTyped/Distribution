package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxTreeMap
import typings.devextreme.mod.DevExpress.viz.dxTreeMapNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementModelNode extends js.Object {
  var component: js.UndefOr[dxTreeMap] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var node: js.UndefOr[dxTreeMapNode] = js.undefined
}

object AnonElementModelNode {
  @scala.inline
  def apply(
    component: dxTreeMap = null,
    element: dxElement = null,
    model: js.Any = null,
    node: dxTreeMapNode = null
  ): AnonElementModelNode = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementModelNode]
  }
}

