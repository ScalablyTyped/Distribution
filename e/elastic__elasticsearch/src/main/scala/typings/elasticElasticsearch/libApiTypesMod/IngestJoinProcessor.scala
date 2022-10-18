package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestJoinProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var separator: String
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestJoinProcessor {
  
  inline def apply(field: Field, separator: String): IngestJoinProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestJoinProcessor]
  }
  
  extension [Self <: IngestJoinProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
