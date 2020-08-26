package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.StackedBarSeries */
@js.native
trait dxChartSeriesTypesStackedBarSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.StackedBarSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStackedBarSeries: js.UndefOr[dxChartSeriesTypesStackedBarSeriesAggregation] = js.native
  /** @name dxChartSeriesTypes.StackedBarSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStackedBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  /** @name dxChartSeriesTypes.StackedBarSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesStackedBarSeries: js.UndefOr[dxChartSeriesTypesStackedBarSeriesLabel] = js.native
  /** @name dxChartSeriesTypes.StackedBarSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStackedBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
}

object dxChartSeriesTypesStackedBarSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesStackedBarSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStackedBarSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesStackedBarSeriesOps[Self <: dxChartSeriesTypesStackedBarSeries] (val x: Self) extends AnyVal {
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
    def setAggregation(value: dxChartSeriesTypesStackedBarSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxChartSeriesTypesStackedBarSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

