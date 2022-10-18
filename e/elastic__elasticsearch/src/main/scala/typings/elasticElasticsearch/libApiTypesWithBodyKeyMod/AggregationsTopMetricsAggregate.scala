package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTopMetricsAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var top: js.Array[AggregationsTopMetrics]
}
object AggregationsTopMetricsAggregate {
  
  inline def apply(top: js.Array[AggregationsTopMetrics]): AggregationsTopMetricsAggregate = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTopMetricsAggregate]
  }
  
  extension [Self <: AggregationsTopMetricsAggregate](x: Self) {
    
    inline def setTop(value: js.Array[AggregationsTopMetrics]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopVarargs(value: AggregationsTopMetrics*): Self = StObject.set(x, "top", js.Array(value*))
  }
}
