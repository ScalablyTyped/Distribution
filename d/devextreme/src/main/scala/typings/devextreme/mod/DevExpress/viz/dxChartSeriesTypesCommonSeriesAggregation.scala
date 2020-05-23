package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.ohlc
import typings.devextreme.devextremeStrings.range
import typings.devextreme.devextremeStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.aggregation */
trait dxChartSeriesTypesCommonSeriesAggregation extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.aggregation.calculate */
  var calculate: js.UndefOr[
    js.Function2[
      /* aggregationInfo */ chartPointAggregationInfoObject, 
      /* series */ chartSeriesObject, 
      _ | js.Array[_]
    ]
  ] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.aggregation.enabled */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.aggregation.method */
  var method: js.UndefOr[avg | count | max | min | ohlc | range | sum | custom] = js.undefined
}

object dxChartSeriesTypesCommonSeriesAggregation {
  @scala.inline
  def apply(
    calculate: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => _ | js.Array[_] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    method: avg | count | max | min | ohlc | range | sum | custom = null
  ): dxChartSeriesTypesCommonSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction2(calculate))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesAggregation]
  }
}

