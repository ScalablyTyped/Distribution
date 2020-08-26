package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.StackedAreaSeries */
@js.native
trait dxChartSeriesTypesStackedAreaSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.StackedAreaSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStackedAreaSeries: js.UndefOr[dxChartSeriesTypesStackedAreaSeriesAggregation] = js.native
  /** @name dxChartSeriesTypes.StackedAreaSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStackedAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** @name dxChartSeriesTypes.StackedAreaSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesStackedAreaSeries: js.UndefOr[dxChartSeriesTypesStackedAreaSeriesLabel] = js.native
  /** @name dxChartSeriesTypes.StackedAreaSeries.point */
  @JSName("point")
  var point_dxChartSeriesTypesStackedAreaSeries: js.UndefOr[dxChartSeriesTypesStackedAreaSeriesPoint] = js.native
  /** @name dxChartSeriesTypes.StackedAreaSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStackedAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}

object dxChartSeriesTypesStackedAreaSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesStackedAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStackedAreaSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesStackedAreaSeriesOps[Self <: dxChartSeriesTypesStackedAreaSeries] (val x: Self) extends AnyVal {
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
    def setAggregation(value: dxChartSeriesTypesStackedAreaSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxChartSeriesTypesStackedAreaSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPoint(value: dxChartSeriesTypesStackedAreaSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

