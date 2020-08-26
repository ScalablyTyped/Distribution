package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.StepLineSeries */
@js.native
trait dxChartSeriesTypesStepLineSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.StepLineSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStepLineSeries: js.UndefOr[dxChartSeriesTypesStepLineSeriesAggregation] = js.native
  /** @name dxChartSeriesTypes.StepLineSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStepLineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** @name dxChartSeriesTypes.StepLineSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesStepLineSeries: js.UndefOr[dxChartSeriesTypesStepLineSeriesLabel] = js.native
  /** @name dxChartSeriesTypes.StepLineSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStepLineSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}

object dxChartSeriesTypesStepLineSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesStepLineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepLineSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesStepLineSeriesOps[Self <: dxChartSeriesTypesStepLineSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregation(value: dxChartSeriesTypesStepLineSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxChartSeriesTypesStepLineSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

