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

/** Configures data aggregation for the series. */
trait dxChartSeriesTypesCommonSeriesAggregation extends js.Object {
  /** Specifies a custom aggregate function. Applies only if the aggregation method is "custom". */
  var calculate: js.UndefOr[
    js.Function2[
      /* aggregationInfo */ chartPointAggregationInfoObject, 
      /* series */ chartSeriesObject, 
      _ | js.Array[_]
    ]
  ] = js.undefined
  /** Enables data aggregation for the series. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies how to aggregate series points. */
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
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesAggregation]
  }
}

