package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Compresseddefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Compresseddefinition] = js.undefined
  
  var defer_definition_decompression: js.UndefOr[Boolean] = js.undefined
  
  var model_id: Id
}
object MlPutTrainedModelRequest {
  
  inline def apply(model_id: Id): MlPutTrainedModelRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelRequest]
  }
  
  extension [Self <: MlPutTrainedModelRequest](x: Self) {
    
    inline def setBody(value: Compresseddefinition): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDefer_definition_decompression(value: Boolean): Self = StObject.set(x, "defer_definition_decompression", value.asInstanceOf[js.Any])
    
    inline def setDefer_definition_decompressionUndefined: Self = StObject.set(x, "defer_definition_decompression", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
