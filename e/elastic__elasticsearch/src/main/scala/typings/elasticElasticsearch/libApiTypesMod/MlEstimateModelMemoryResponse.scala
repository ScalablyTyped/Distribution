package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEstimateModelMemoryResponse extends StObject {
  
  var model_memory_estimate: String
}
object MlEstimateModelMemoryResponse {
  
  inline def apply(model_memory_estimate: String): MlEstimateModelMemoryResponse = {
    val __obj = js.Dynamic.literal(model_memory_estimate = model_memory_estimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEstimateModelMemoryResponse]
  }
  
  extension [Self <: MlEstimateModelMemoryResponse](x: Self) {
    
    inline def setModel_memory_estimate(value: String): Self = StObject.set(x, "model_memory_estimate", value.asInstanceOf[js.Any])
  }
}
