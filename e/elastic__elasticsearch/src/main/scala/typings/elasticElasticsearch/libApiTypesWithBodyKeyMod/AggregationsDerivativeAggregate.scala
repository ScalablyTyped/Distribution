package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsDerivativeAggregate
  extends StObject
     with AggregationsSingleMetricAggregateBase
     with _AggregationsAggregate {
  
  var normalized_value: js.UndefOr[double] = js.undefined
  
  var normalized_value_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsDerivativeAggregate {
  
  inline def apply(): AggregationsDerivativeAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[AggregationsDerivativeAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsDerivativeAggregate] (val x: Self) extends AnyVal {
    
    inline def setNormalized_value(value: double): Self = StObject.set(x, "normalized_value", value.asInstanceOf[js.Any])
    
    inline def setNormalized_valueUndefined: Self = StObject.set(x, "normalized_value", js.undefined)
    
    inline def setNormalized_value_as_string(value: String): Self = StObject.set(x, "normalized_value_as_string", value.asInstanceOf[js.Any])
    
    inline def setNormalized_value_as_stringUndefined: Self = StObject.set(x, "normalized_value_as_string", js.undefined)
  }
}
