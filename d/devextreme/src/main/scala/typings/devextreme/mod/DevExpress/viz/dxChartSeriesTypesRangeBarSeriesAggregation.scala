package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.RangeBarSeries.aggregation */
@js.native
trait dxChartSeriesTypesRangeBarSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  /** @name dxChartSeriesTypes.RangeBarSeries.aggregation.method */
  @JSName("method")
  var method_dxChartSeriesTypesRangeBarSeriesAggregation: js.UndefOr[range | custom] = js.native
}

object dxChartSeriesTypesRangeBarSeriesAggregation {
  @scala.inline
  def apply(): dxChartSeriesTypesRangeBarSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesRangeBarSeriesAggregation]
  }
  @scala.inline
  implicit class dxChartSeriesTypesRangeBarSeriesAggregationOps[Self <: dxChartSeriesTypesRangeBarSeriesAggregation] (val x: Self) extends AnyVal {
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
    def setMethod(value: range | custom): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

