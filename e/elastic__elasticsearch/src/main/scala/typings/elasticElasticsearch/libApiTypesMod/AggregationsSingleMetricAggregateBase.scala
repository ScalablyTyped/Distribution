package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSingleMetricAggregateBase
  extends StObject
     with AggregationsAggregateBase {
  
  var value: double | Null
  
  var value_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsSingleMetricAggregateBase {
  
  inline def apply(): AggregationsSingleMetricAggregateBase = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[AggregationsSingleMetricAggregateBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsSingleMetricAggregateBase] (val x: Self) extends AnyVal {
    
    inline def setValue(value: double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValue_as_string(value: String): Self = StObject.set(x, "value_as_string", value.asInstanceOf[js.Any])
    
    inline def setValue_as_stringUndefined: Self = StObject.set(x, "value_as_string", js.undefined)
  }
}
