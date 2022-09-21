package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.viz.dxChart.ChartBubbleSeriesAggregationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesBubbleSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesBubbleSeriesAggregation: js.UndefOr[ChartBubbleSeriesAggregationMethod] = js.undefined
}
object dxChartSeriesTypesBubbleSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesBubbleSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesBubbleSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesBubbleSeriesAggregation](x: Self) {
    
    inline def setMethod(value: ChartBubbleSeriesAggregationMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
