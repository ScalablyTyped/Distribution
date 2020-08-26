package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.FullStackedBarSeries.aggregation */
@js.native
trait dxChartSeriesTypesFullStackedBarSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  /** @name dxChartSeriesTypes.FullStackedBarSeries.aggregation.method */
  @JSName("method")
  var method_dxChartSeriesTypesFullStackedBarSeriesAggregation: js.UndefOr[avg | count | max | min | sum | custom] = js.native
}

object dxChartSeriesTypesFullStackedBarSeriesAggregation {
  @scala.inline
  def apply(): dxChartSeriesTypesFullStackedBarSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedBarSeriesAggregation]
  }
  @scala.inline
  implicit class dxChartSeriesTypesFullStackedBarSeriesAggregationOps[Self <: dxChartSeriesTypesFullStackedBarSeriesAggregation] (val x: Self) extends AnyVal {
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
    def setMethod(value: avg | count | max | min | sum | custom): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

