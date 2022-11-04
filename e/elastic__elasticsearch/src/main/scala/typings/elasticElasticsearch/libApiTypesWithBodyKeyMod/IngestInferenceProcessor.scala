package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestInferenceProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field_map: js.UndefOr[Record[Field, Any]] = js.undefined
  
  var inference_config: js.UndefOr[IngestInferenceConfig] = js.undefined
  
  var model_id: Id
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestInferenceProcessor {
  
  inline def apply(model_id: Id): IngestInferenceProcessor = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestInferenceProcessor]
  }
  
  extension [Self <: IngestInferenceProcessor](x: Self) {
    
    inline def setField_map(value: Record[Field, Any]): Self = StObject.set(x, "field_map", value.asInstanceOf[js.Any])
    
    inline def setField_mapUndefined: Self = StObject.set(x, "field_map", js.undefined)
    
    inline def setInference_config(value: IngestInferenceConfig): Self = StObject.set(x, "inference_config", value.asInstanceOf[js.Any])
    
    inline def setInference_configUndefined: Self = StObject.set(x, "inference_config", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
