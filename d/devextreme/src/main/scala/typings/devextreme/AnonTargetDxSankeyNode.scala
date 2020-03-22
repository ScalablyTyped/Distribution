package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxSankey
import typings.devextreme.mod.DevExpress.viz.dxSankeyNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetDxSankeyNode extends js.Object {
  var component: js.UndefOr[dxSankey] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[dxSankeyNode] = js.undefined
}

object AnonTargetDxSankeyNode {
  @scala.inline
  def apply(
    component: dxSankey = null,
    element: dxElement = null,
    model: js.Any = null,
    target: dxSankeyNode = null
  ): AnonTargetDxSankeyNode = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetDxSankeyNode]
  }
}

