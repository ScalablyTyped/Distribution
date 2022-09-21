package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.viz.dxChart.ChartFinancialSeriesAggregationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCandleStickSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesCandleStickSeriesAggregation: js.UndefOr[ChartFinancialSeriesAggregationMethod] = js.undefined
}
object dxChartSeriesTypesCandleStickSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesCandleStickSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesCandleStickSeriesAggregation](x: Self) {
    
    inline def setMethod(value: ChartFinancialSeriesAggregationMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
