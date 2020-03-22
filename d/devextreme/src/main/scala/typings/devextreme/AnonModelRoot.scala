package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxTreeMap
import typings.devextreme.mod.DevExpress.viz.dxTreeMapNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModelRoot extends js.Object {
  var component: js.UndefOr[dxTreeMap] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[dxTreeMapNode] = js.undefined
}

object AnonModelRoot {
  @scala.inline
  def apply(
    component: dxTreeMap = null,
    element: dxElement = null,
    model: js.Any = null,
    root: dxTreeMapNode = null
  ): AnonModelRoot = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModelRoot]
  }
}

