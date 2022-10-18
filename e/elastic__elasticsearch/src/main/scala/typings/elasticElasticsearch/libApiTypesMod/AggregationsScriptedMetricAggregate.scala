package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsScriptedMetricAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var value: Any
}
object AggregationsScriptedMetricAggregate {
  
  inline def apply(value: Any): AggregationsScriptedMetricAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsScriptedMetricAggregate]
  }
  
  extension [Self <: AggregationsScriptedMetricAggregate](x: Self) {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
