package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelConfig extends StObject {
  
  var compressed_definition: js.UndefOr[String] = js.undefined
  
  var create_time: js.UndefOr[DateTime] = js.undefined
  
  var created_by: js.UndefOr[String] = js.undefined
  
  var default_field_map: js.UndefOr[Record[String, String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var estimated_heap_memory_usage_bytes: js.UndefOr[integer] = js.undefined
  
  var estimated_operations: js.UndefOr[integer] = js.undefined
  
  var inference_config: MlInferenceConfigCreateContainer
  
  var input: MlTrainedModelConfigInput
  
  var license_level: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[MlTrainedModelLocation] = js.undefined
  
  var metadata: js.UndefOr[MlTrainedModelConfigMetadata] = js.undefined
  
  var model_id: Id
  
  var model_size_bytes: js.UndefOr[ByteSize] = js.undefined
  
  var model_type: js.UndefOr[MlTrainedModelType] = js.undefined
  
  var tags: js.Array[String]
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object MlTrainedModelConfig {
  
  inline def apply(
    inference_config: MlInferenceConfigCreateContainer,
    input: MlTrainedModelConfigInput,
    model_id: Id,
    tags: js.Array[String]
  ): MlTrainedModelConfig = {
    val __obj = js.Dynamic.literal(inference_config = inference_config.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTrainedModelConfig] (val x: Self) extends AnyVal {
    
    inline def setCompressed_definition(value: String): Self = StObject.set(x, "compressed_definition", value.asInstanceOf[js.Any])
    
    inline def setCompressed_definitionUndefined: Self = StObject.set(x, "compressed_definition", js.undefined)
    
    inline def setCreate_time(value: DateTime): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setCreated_byUndefined: Self = StObject.set(x, "created_by", js.undefined)
    
    inline def setDefault_field_map(value: Record[String, String]): Self = StObject.set(x, "default_field_map", value.asInstanceOf[js.Any])
    
    inline def setDefault_field_mapUndefined: Self = StObject.set(x, "default_field_map", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEstimated_heap_memory_usage_bytes(value: integer): Self = StObject.set(x, "estimated_heap_memory_usage_bytes", value.asInstanceOf[js.Any])
    
    inline def setEstimated_heap_memory_usage_bytesUndefined: Self = StObject.set(x, "estimated_heap_memory_usage_bytes", js.undefined)
    
    inline def setEstimated_operations(value: integer): Self = StObject.set(x, "estimated_operations", value.asInstanceOf[js.Any])
    
    inline def setEstimated_operationsUndefined: Self = StObject.set(x, "estimated_operations", js.undefined)
    
    inline def setInference_config(value: MlInferenceConfigCreateContainer): Self = StObject.set(x, "inference_config", value.asInstanceOf[js.Any])
    
    inline def setInput(value: MlTrainedModelConfigInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLicense_level(value: String): Self = StObject.set(x, "license_level", value.asInstanceOf[js.Any])
    
    inline def setLicense_levelUndefined: Self = StObject.set(x, "license_level", js.undefined)
    
    inline def setLocation(value: MlTrainedModelLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMetadata(value: MlTrainedModelConfigMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_size_bytes(value: ByteSize): Self = StObject.set(x, "model_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setModel_size_bytesUndefined: Self = StObject.set(x, "model_size_bytes", js.undefined)
    
    inline def setModel_type(value: MlTrainedModelType): Self = StObject.set(x, "model_type", value.asInstanceOf[js.Any])
    
    inline def setModel_typeUndefined: Self = StObject.set(x, "model_type", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
