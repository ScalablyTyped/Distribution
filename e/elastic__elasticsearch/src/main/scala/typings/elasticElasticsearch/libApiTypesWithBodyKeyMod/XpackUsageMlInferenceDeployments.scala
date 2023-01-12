package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlInferenceDeployments extends StObject {
  
  var count: integer
  
  var inference_counts: MlJobStatistics
  
  var model_sizes_bytes: MlJobStatistics
  
  var time_ms: XpackUsageMlInferenceDeploymentsTimeMs
}
object XpackUsageMlInferenceDeployments {
  
  inline def apply(
    count: integer,
    inference_counts: MlJobStatistics,
    model_sizes_bytes: MlJobStatistics,
    time_ms: XpackUsageMlInferenceDeploymentsTimeMs
  ): XpackUsageMlInferenceDeployments = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], inference_counts = inference_counts.asInstanceOf[js.Any], model_sizes_bytes = model_sizes_bytes.asInstanceOf[js.Any], time_ms = time_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlInferenceDeployments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlInferenceDeployments] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setInference_counts(value: MlJobStatistics): Self = StObject.set(x, "inference_counts", value.asInstanceOf[js.Any])
    
    inline def setModel_sizes_bytes(value: MlJobStatistics): Self = StObject.set(x, "model_sizes_bytes", value.asInstanceOf[js.Any])
    
    inline def setTime_ms(value: XpackUsageMlInferenceDeploymentsTimeMs): Self = StObject.set(x, "time_ms", value.asInstanceOf[js.Any])
  }
}
