package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxVectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  var component: js.UndefOr[dxVectorMap] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonCenter {
  @scala.inline
  def apply(
    center: js.Array[Double] = null,
    component: dxVectorMap = null,
    element: dxElement = null,
    model: js.Any = null
  ): AnonCenter = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenter]
  }
}

