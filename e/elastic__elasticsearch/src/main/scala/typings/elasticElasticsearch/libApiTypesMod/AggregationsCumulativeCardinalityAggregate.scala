package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCumulativeCardinalityAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var value: long
  
  var value_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsCumulativeCardinalityAggregate {
  
  inline def apply(value: long): AggregationsCumulativeCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsCumulativeCardinalityAggregate]
  }
  
  extension [Self <: AggregationsCumulativeCardinalityAggregate](x: Self) {
    
    inline def setValue(value: long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValue_as_string(value: String): Self = StObject.set(x, "value_as_string", value.asInstanceOf[js.Any])
    
    inline def setValue_as_stringUndefined: Self = StObject.set(x, "value_as_string", js.undefined)
  }
}
