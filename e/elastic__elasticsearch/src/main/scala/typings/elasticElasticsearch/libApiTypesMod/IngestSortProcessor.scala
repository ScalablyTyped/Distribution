package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSortProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var order: SortOrder
  
  var target_field: Field
}
object IngestSortProcessor {
  
  inline def apply(field: Field, order: SortOrder, target_field: Field): IngestSortProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], target_field = target_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSortProcessor]
  }
  
  extension [Self <: IngestSortProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
  }
}
