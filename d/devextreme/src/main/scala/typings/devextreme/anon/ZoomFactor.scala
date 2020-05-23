package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxVectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomFactor extends js.Object {
  var component: js.UndefOr[dxVectorMap] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object ZoomFactor {
  @scala.inline
  def apply(
    component: dxVectorMap = null,
    element: dxElement = null,
    model: js.Any = null,
    zoomFactor: js.UndefOr[Double] = js.undefined
  ): ZoomFactor = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomFactor)) __obj.updateDynamic("zoomFactor")(zoomFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomFactor]
  }
}

