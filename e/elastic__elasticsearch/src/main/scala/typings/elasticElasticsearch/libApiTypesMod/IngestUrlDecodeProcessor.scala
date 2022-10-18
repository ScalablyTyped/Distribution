package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestUrlDecodeProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestUrlDecodeProcessor {
  
  inline def apply(field: Field): IngestUrlDecodeProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestUrlDecodeProcessor]
  }
  
  extension [Self <: IngestUrlDecodeProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
