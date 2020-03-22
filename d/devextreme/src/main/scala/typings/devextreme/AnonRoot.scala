package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoot extends js.Object {
  var component: js.UndefOr[dxTreeList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[dxTreeListNode] = js.undefined
}

object AnonRoot {
  @scala.inline
  def apply(
    component: dxTreeList = null,
    element: dxElement = null,
    model: js.Any = null,
    root: dxTreeListNode = null
  ): AnonRoot = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoot]
  }
}

