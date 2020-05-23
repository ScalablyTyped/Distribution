package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.MapLayerElement
import typings.devextreme.mod.DevExpress.viz.dxVectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDxVectorMap extends js.Object {
  var component: js.UndefOr[dxVectorMap] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[MapLayerElement] = js.undefined
}

object ComponentDxVectorMap {
  @scala.inline
  def apply(
    component: dxVectorMap = null,
    element: dxElement = null,
    model: js.Any = null,
    target: MapLayerElement = null
  ): ComponentDxVectorMap = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDxVectorMap]
  }
}

