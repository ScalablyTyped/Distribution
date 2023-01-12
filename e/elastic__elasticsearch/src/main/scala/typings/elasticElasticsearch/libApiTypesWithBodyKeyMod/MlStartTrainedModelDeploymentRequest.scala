package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStartTrainedModelDeploymentRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var cache_size: js.UndefOr[ByteSize] = js.undefined
  
  var model_id: Id
  
  var number_of_allocations: js.UndefOr[integer] = js.undefined
  
  var queue_capacity: js.UndefOr[integer] = js.undefined
  
  var threads_per_allocation: js.UndefOr[integer] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for: js.UndefOr[MlDeploymentAllocationState] = js.undefined
}
object MlStartTrainedModelDeploymentRequest {
  
  inline def apply(model_id: Id): MlStartTrainedModelDeploymentRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStartTrainedModelDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlStartTrainedModelDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setCache_size(value: ByteSize): Self = StObject.set(x, "cache_size", value.asInstanceOf[js.Any])
    
    inline def setCache_sizeUndefined: Self = StObject.set(x, "cache_size", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_allocations(value: integer): Self = StObject.set(x, "number_of_allocations", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_allocationsUndefined: Self = StObject.set(x, "number_of_allocations", js.undefined)
    
    inline def setQueue_capacity(value: integer): Self = StObject.set(x, "queue_capacity", value.asInstanceOf[js.Any])
    
    inline def setQueue_capacityUndefined: Self = StObject.set(x, "queue_capacity", js.undefined)
    
    inline def setThreads_per_allocation(value: integer): Self = StObject.set(x, "threads_per_allocation", value.asInstanceOf[js.Any])
    
    inline def setThreads_per_allocationUndefined: Self = StObject.set(x, "threads_per_allocation", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for(value: MlDeploymentAllocationState): Self = StObject.set(x, "wait_for", value.asInstanceOf[js.Any])
    
    inline def setWait_forUndefined: Self = StObject.set(x, "wait_for", js.undefined)
  }
}
