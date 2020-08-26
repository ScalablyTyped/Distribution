package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.SplineSeries */
@js.native
trait dxChartSeriesTypesSplineSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.SplineSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesSplineSeries: js.UndefOr[dxChartSeriesTypesSplineSeriesAggregation] = js.native
  /** @name dxChartSeriesTypes.SplineSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesSplineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** @name dxChartSeriesTypes.SplineSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesSplineSeries: js.UndefOr[dxChartSeriesTypesSplineSeriesLabel] = js.native
  /** @name dxChartSeriesTypes.SplineSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesSplineSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}

object dxChartSeriesTypesSplineSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesSplineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesSplineSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesSplineSeriesOps[Self <: dxChartSeriesTypesSplineSeries] (val x: Self) extends AnyVal {
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
    def setAggregation(value: dxChartSeriesTypesSplineSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxChartSeriesTypesSplineSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

