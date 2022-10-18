package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStatsAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var avg: double | Null
  
  var avg_as_string: js.UndefOr[String] = js.undefined
  
  var count: long
  
  var max: double | Null
  
  var max_as_string: js.UndefOr[String] = js.undefined
  
  var min: double | Null
  
  var min_as_string: js.UndefOr[String] = js.undefined
  
  var sum: double
  
  var sum_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsStatsAggregate {
  
  inline def apply(count: long, sum: double): AggregationsStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null)
    __obj.asInstanceOf[AggregationsStatsAggregate]
  }
  
  extension [Self <: AggregationsStatsAggregate](x: Self) {
    
    inline def setAvg(value: double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setAvgNull: Self = StObject.set(x, "avg", null)
    
    inline def setAvg_as_string(value: String): Self = StObject.set(x, "avg_as_string", value.asInstanceOf[js.Any])
    
    inline def setAvg_as_stringUndefined: Self = StObject.set(x, "avg_as_string", js.undefined)
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMax(value: double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMax_as_string(value: String): Self = StObject.set(x, "max_as_string", value.asInstanceOf[js.Any])
    
    inline def setMax_as_stringUndefined: Self = StObject.set(x, "max_as_string", js.undefined)
    
    inline def setMin(value: double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMin_as_string(value: String): Self = StObject.set(x, "min_as_string", value.asInstanceOf[js.Any])
    
    inline def setMin_as_stringUndefined: Self = StObject.set(x, "min_as_string", js.undefined)
    
    inline def setSum(value: double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSum_as_string(value: String): Self = StObject.set(x, "sum_as_string", value.asInstanceOf[js.Any])
    
    inline def setSum_as_stringUndefined: Self = StObject.set(x, "sum_as_string", js.undefined)
  }
}
