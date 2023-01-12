package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelDefinitionPartRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var definition: String
  
  var model_id: Id
  
  var part: integer
  
  var total_definition_length: long
  
  var total_parts: integer
}
object MlPutTrainedModelDefinitionPartRequest {
  
  inline def apply(
    definition: String,
    model_id: Id,
    part: integer,
    total_definition_length: long,
    total_parts: integer
  ): MlPutTrainedModelDefinitionPartRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], total_definition_length = total_definition_length.asInstanceOf[js.Any], total_parts = total_parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelDefinitionPartRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelDefinitionPartRequest] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setPart(value: integer): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setTotal_definition_length(value: long): Self = StObject.set(x, "total_definition_length", value.asInstanceOf[js.Any])
    
    inline def setTotal_parts(value: integer): Self = StObject.set(x, "total_parts", value.asInstanceOf[js.Any])
  }
}
