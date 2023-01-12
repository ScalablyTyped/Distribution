package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCardinalityAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var value: long
}
object AggregationsCardinalityAggregate {
  
  inline def apply(value: long): AggregationsCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsCardinalityAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsCardinalityAggregate] (val x: Self) extends AnyVal {
    
    inline def setValue(value: long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
