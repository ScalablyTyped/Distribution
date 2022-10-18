package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Inferenceconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInferTrainedModelRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Inferenceconfig] = js.undefined
  
  var model_id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlInferTrainedModelRequest {
  
  inline def apply(model_id: Id): MlInferTrainedModelRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInferTrainedModelRequest]
  }
  
  extension [Self <: MlInferTrainedModelRequest](x: Self) {
    
    inline def setBody(value: Inferenceconfig): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
