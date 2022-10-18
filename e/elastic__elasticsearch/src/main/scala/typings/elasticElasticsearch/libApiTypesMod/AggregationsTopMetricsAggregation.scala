package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTopMetricsAggregation
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var metrics: js.UndefOr[AggregationsTopMetricsValue | js.Array[AggregationsTopMetricsValue]] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
}
object AggregationsTopMetricsAggregation {
  
  inline def apply(): AggregationsTopMetricsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsTopMetricsAggregation]
  }
  
  extension [Self <: AggregationsTopMetricsAggregation](x: Self) {
    
    inline def setMetrics(value: AggregationsTopMetricsValue | js.Array[AggregationsTopMetricsValue]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: AggregationsTopMetricsValue*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortCombinations*): Self = StObject.set(x, "sort", js.Array(value*))
  }
}
