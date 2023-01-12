package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInferTrainedModelRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var docs: js.Array[Record[String, Any]]
  
  var inference_config: js.UndefOr[MlInferenceConfigUpdateContainer] = js.undefined
  
  var model_id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlInferTrainedModelRequest {
  
  inline def apply(docs: js.Array[Record[String, Any]], model_id: Id): MlInferTrainedModelRequest = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInferTrainedModelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlInferTrainedModelRequest] (val x: Self) extends AnyVal {
    
    inline def setDocs(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setInference_config(value: MlInferenceConfigUpdateContainer): Self = StObject.set(x, "inference_config", value.asInstanceOf[js.Any])
    
    inline def setInference_configUndefined: Self = StObject.set(x, "inference_config", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
