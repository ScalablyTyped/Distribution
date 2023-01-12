package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlInferenceTrainedModels extends StObject {
  
  var _all: XpackUsageMlCounter
  
  var count: js.UndefOr[XpackUsageMlInferenceTrainedModelsCount] = js.undefined
  
  var estimated_heap_memory_usage_bytes: js.UndefOr[MlJobStatistics] = js.undefined
  
  var estimated_operations: js.UndefOr[MlJobStatistics] = js.undefined
  
  var model_size_bytes: js.UndefOr[MlJobStatistics] = js.undefined
}
object XpackUsageMlInferenceTrainedModels {
  
  inline def apply(_all: XpackUsageMlCounter): XpackUsageMlInferenceTrainedModels = {
    val __obj = js.Dynamic.literal(_all = _all.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlInferenceTrainedModels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlInferenceTrainedModels] (val x: Self) extends AnyVal {
    
    inline def setCount(value: XpackUsageMlInferenceTrainedModelsCount): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEstimated_heap_memory_usage_bytes(value: MlJobStatistics): Self = StObject.set(x, "estimated_heap_memory_usage_bytes", value.asInstanceOf[js.Any])
    
    inline def setEstimated_heap_memory_usage_bytesUndefined: Self = StObject.set(x, "estimated_heap_memory_usage_bytes", js.undefined)
    
    inline def setEstimated_operations(value: MlJobStatistics): Self = StObject.set(x, "estimated_operations", value.asInstanceOf[js.Any])
    
    inline def setEstimated_operationsUndefined: Self = StObject.set(x, "estimated_operations", js.undefined)
    
    inline def setModel_size_bytes(value: MlJobStatistics): Self = StObject.set(x, "model_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setModel_size_bytesUndefined: Self = StObject.set(x, "model_size_bytes", js.undefined)
    
    inline def set_all(value: XpackUsageMlCounter): Self = StObject.set(x, "_all", value.asInstanceOf[js.Any])
  }
}
