package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestJsonProcessor
  extends StObject
     with IngestProcessorBase {
  
  var add_to_root: Boolean
  
  var field: Field
  
  var target_field: Field
}
object IngestJsonProcessor {
  
  inline def apply(add_to_root: Boolean, field: Field, target_field: Field): IngestJsonProcessor = {
    val __obj = js.Dynamic.literal(add_to_root = add_to_root.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], target_field = target_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestJsonProcessor]
  }
  
  extension [Self <: IngestJsonProcessor](x: Self) {
    
    inline def setAdd_to_root(value: Boolean): Self = StObject.set(x, "add_to_root", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
  }
}
