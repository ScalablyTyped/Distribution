package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlInferenceConfigCreateContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlPutTrainedModelDefinition
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlPutTrainedModelInput
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlTrainedModelType
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compresseddefinition extends StObject {
  
  var compressed_definition: js.UndefOr[String] = js.undefined
  
  var definition: js.UndefOr[MlPutTrainedModelDefinition] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var inference_config: MlInferenceConfigCreateContainer
  
  var input: MlPutTrainedModelInput
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var model_size_bytes: js.UndefOr[long] = js.undefined
  
  var model_type: js.UndefOr[MlTrainedModelType] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object Compresseddefinition {
  
  inline def apply(inference_config: MlInferenceConfigCreateContainer, input: MlPutTrainedModelInput): Compresseddefinition = {
    val __obj = js.Dynamic.literal(inference_config = inference_config.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compresseddefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compresseddefinition] (val x: Self) extends AnyVal {
    
    inline def setCompressed_definition(value: String): Self = StObject.set(x, "compressed_definition", value.asInstanceOf[js.Any])
    
    inline def setCompressed_definitionUndefined: Self = StObject.set(x, "compressed_definition", js.undefined)
    
    inline def setDefinition(value: MlPutTrainedModelDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInference_config(value: MlInferenceConfigCreateContainer): Self = StObject.set(x, "inference_config", value.asInstanceOf[js.Any])
    
    inline def setInput(value: MlPutTrainedModelInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setModel_size_bytes(value: long): Self = StObject.set(x, "model_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setModel_size_bytesUndefined: Self = StObject.set(x, "model_size_bytes", js.undefined)
    
    inline def setModel_type(value: MlTrainedModelType): Self = StObject.set(x, "model_type", value.asInstanceOf[js.Any])
    
    inline def setModel_typeUndefined: Self = StObject.set(x, "model_type", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
