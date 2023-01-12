package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlEstimateModelMemoryResponse] (val x: Self) extends AnyVal {
    
    inline def setModel_memory_estimate(value: String): Self = StObject.set(x, "model_memory_estimate", value.asInstanceOf[js.Any])
  }
}
