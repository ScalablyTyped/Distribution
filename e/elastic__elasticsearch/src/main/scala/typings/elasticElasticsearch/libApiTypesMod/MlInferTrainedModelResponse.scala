package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInferTrainedModelResponse extends StObject {
  
  var inference_results: js.Array[MlInferenceResponseResult]
}
object MlInferTrainedModelResponse {
  
  inline def apply(inference_results: js.Array[MlInferenceResponseResult]): MlInferTrainedModelResponse = {
    val __obj = js.Dynamic.literal(inference_results = inference_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInferTrainedModelResponse]
  }
  
  extension [Self <: MlInferTrainedModelResponse](x: Self) {
    
    inline def setInference_results(value: js.Array[MlInferenceResponseResult]): Self = StObject.set(x, "inference_results", value.asInstanceOf[js.Any])
    
    inline def setInference_resultsVarargs(value: MlInferenceResponseResult*): Self = StObject.set(x, "inference_results", js.Array(value*))
  }
}
