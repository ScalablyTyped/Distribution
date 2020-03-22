package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.ohlc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures data aggregation for the series. */
trait dxChartSeriesTypesCandleStickSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  /** Specifies how to aggregate series points. */
  @JSName("method")
  var method_dxChartSeriesTypesCandleStickSeriesAggregation: js.UndefOr[ohlc | custom] = js.undefined
}

object dxChartSeriesTypesCandleStickSeriesAggregation {
  @scala.inline
  def apply(
    calculate: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => _ | js.Array[_] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    method: ohlc | custom = null
  ): dxChartSeriesTypesCandleStickSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction2(calculate))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesAggregation]
  }
}

