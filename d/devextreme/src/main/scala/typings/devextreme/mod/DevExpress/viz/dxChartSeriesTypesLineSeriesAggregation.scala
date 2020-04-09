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

/** @name dxChartSeriesTypes.LineSeries.aggregation */
trait dxChartSeriesTypesLineSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  /** @name dxChartSeriesTypes.LineSeries.aggregation.method */
  @JSName("method")
  var method_dxChartSeriesTypesLineSeriesAggregation: js.UndefOr[avg | count | max | min | sum | custom] = js.undefined
}

object dxChartSeriesTypesLineSeriesAggregation {
  @scala.inline
  def apply(
    calculate: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => _ | js.Array[_] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    method: avg | count | max | min | sum | custom = null
  ): dxChartSeriesTypesLineSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction2(calculate))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesLineSeriesAggregation]
  }
}

