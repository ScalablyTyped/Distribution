package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMultiTermLookup extends StObject {
  
  var field: Field
}
object AggregationsMultiTermLookup {
  
  inline def apply(field: Field): AggregationsMultiTermLookup = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMultiTermLookup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsMultiTermLookup] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
