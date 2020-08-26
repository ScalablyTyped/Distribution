package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.FullStackedLineSeries */
@js.native
trait dxChartSeriesTypesFullStackedLineSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.FullStackedLineSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedLineSeries: js.UndefOr[dxChartSeriesTypesFullStackedLineSeriesAggregation] = js.native
  /** @name dxChartSeriesTypes.FullStackedLineSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedLineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** @name dxChartSeriesTypes.FullStackedLineSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedLineSeries: js.UndefOr[dxChartSeriesTypesFullStackedLineSeriesLabel] = js.native
  /** @name dxChartSeriesTypes.FullStackedLineSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedLineSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}

object dxChartSeriesTypesFullStackedLineSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesFullStackedLineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedLineSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesFullStackedLineSeriesOps[Self <: dxChartSeriesTypesFullStackedLineSeries] (val x: Self) extends AnyVal {
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
    def setAggregation(value: dxChartSeriesTypesFullStackedLineSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxChartSeriesTypesFullStackedLineSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

