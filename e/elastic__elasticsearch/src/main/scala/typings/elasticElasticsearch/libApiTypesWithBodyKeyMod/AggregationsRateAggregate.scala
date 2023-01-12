package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsRateAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var value: double
  
  var value_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsRateAggregate {
  
  inline def apply(value: double): AggregationsRateAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsRateAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsRateAggregate] (val x: Self) extends AnyVal {
    
    inline def setValue(value: double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValue_as_string(value: String): Self = StObject.set(x, "value_as_string", value.asInstanceOf[js.Any])
    
    inline def setValue_as_stringUndefined: Self = StObject.set(x, "value_as_string", js.undefined)
  }
}
