package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxPolarChart
import typings.devextreme.mod.DevExpress.viz.polarChartSeriesObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDxPolarChart extends js.Object {
  var component: js.UndefOr[dxPolarChart] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[polarChartSeriesObject] = js.undefined
}

object ComponentDxPolarChart {
  @scala.inline
  def apply(
    component: dxPolarChart = null,
    element: dxElement = null,
    model: js.Any = null,
    target: polarChartSeriesObject = null
  ): ComponentDxPolarChart = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDxPolarChart]
  }
}

