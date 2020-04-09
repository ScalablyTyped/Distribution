package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.RangeAreaSeries.aggregation */
trait dxChartSeriesTypesRangeAreaSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  /** @name dxChartSeriesTypes.RangeAreaSeries.aggregation.method */
  @JSName("method")
  var method_dxChartSeriesTypesRangeAreaSeriesAggregation: js.UndefOr[range | custom] = js.undefined
}

object dxChartSeriesTypesRangeAreaSeriesAggregation {
  @scala.inline
  def apply(
    calculate: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => _ | js.Array[_] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    method: range | custom = null
  ): dxChartSeriesTypesRangeAreaSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction2(calculate))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesRangeAreaSeriesAggregation]
  }
}

