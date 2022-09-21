package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.viz.dxChart.ChartRangeSeriesAggregationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesRangeBarSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesRangeBarSeriesAggregation: js.UndefOr[ChartRangeSeriesAggregationMethod] = js.undefined
}
object dxChartSeriesTypesRangeBarSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesRangeBarSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesRangeBarSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesRangeBarSeriesAggregation](x: Self) {
    
    inline def setMethod(value: ChartRangeSeriesAggregationMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
