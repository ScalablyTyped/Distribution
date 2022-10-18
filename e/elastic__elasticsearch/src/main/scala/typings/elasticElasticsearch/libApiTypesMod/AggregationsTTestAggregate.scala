package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTTestAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var value: double | Null
  
  var value_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsTTestAggregate {
  
  inline def apply(): AggregationsTTestAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[AggregationsTTestAggregate]
  }
  
  extension [Self <: AggregationsTTestAggregate](x: Self) {
    
    inline def setValue(value: double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValue_as_string(value: String): Self = StObject.set(x, "value_as_string", value.asInstanceOf[js.Any])
    
    inline def setValue_as_stringUndefined: Self = StObject.set(x, "value_as_string", js.undefined)
  }
}
