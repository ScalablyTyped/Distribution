package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.BubbleSeries.aggregation */
trait dxChartSeriesTypesBubbleSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  /** @name dxChartSeriesTypes.BubbleSeries.aggregation.method */
  @JSName("method")
  var method_dxChartSeriesTypesBubbleSeriesAggregation: js.UndefOr[avg | custom] = js.undefined
}

object dxChartSeriesTypesBubbleSeriesAggregation {
  @scala.inline
  def apply(
    calculate: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => _ | js.Array[_] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    method: avg | custom = null
  ): dxChartSeriesTypesBubbleSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction2(calculate))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesBubbleSeriesAggregation]
  }
}

