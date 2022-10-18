package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestConvertProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var target_field: Field
  
  var `type`: IngestConvertType
}
object IngestConvertProcessor {
  
  inline def apply(field: Field, target_field: Field, `type`: IngestConvertType): IngestConvertProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], target_field = target_field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestConvertProcessor]
  }
  
  extension [Self <: IngestConvertProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setType(value: IngestConvertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
