package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTopMetricsValue extends StObject {
  
  var field: Field
}
object AggregationsTopMetricsValue {
  
  inline def apply(field: Field): AggregationsTopMetricsValue = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTopMetricsValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsTopMetricsValue] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
