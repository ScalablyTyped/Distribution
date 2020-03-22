package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.chartSeriesObject
import typings.devextreme.mod.DevExpress.viz.dxChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentDxChart extends js.Object {
  var component: js.UndefOr[dxChart] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[chartSeriesObject] = js.undefined
}

object AnonComponentDxChart {
  @scala.inline
  def apply(
    component: dxChart = null,
    element: dxElement = null,
    model: js.Any = null,
    target: chartSeriesObject = null
  ): AnonComponentDxChart = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentDxChart]
  }
}

