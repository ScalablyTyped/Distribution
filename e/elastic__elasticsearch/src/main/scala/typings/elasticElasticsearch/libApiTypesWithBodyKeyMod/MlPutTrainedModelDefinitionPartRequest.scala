package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelDefinitionPartRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Definition] = js.undefined
  
  var model_id: Id
  
  var part: integer
}
object MlPutTrainedModelDefinitionPartRequest {
  
  inline def apply(model_id: Id, part: integer): MlPutTrainedModelDefinitionPartRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelDefinitionPartRequest]
  }
  
  extension [Self <: MlPutTrainedModelDefinitionPartRequest](x: Self) {
    
    inline def setBody(value: Definition): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setPart(value: integer): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
  }
}
