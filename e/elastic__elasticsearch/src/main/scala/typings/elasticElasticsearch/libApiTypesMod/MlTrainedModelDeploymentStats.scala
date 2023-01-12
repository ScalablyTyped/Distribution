package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelDeploymentStats extends StObject {
  
  var allocation_status: MlTrainedModelDeploymentAllocationStatus
  
  var error_count: integer
  
  var inference_count: integer
  
  var model_id: Id
  
  var nodes: MlTrainedModelDeploymentNodesStats
  
  var number_of_allocations: integer
  
  var queue_capacity: integer
  
  var reason: String
  
  var rejected_execution_count: integer
  
  var start_time: EpochTime[UnitMillis]
  
  var state: MlDeploymentState
  
  var threads_per_allocation: integer
  
  var timeout_count: integer
}
object MlTrainedModelDeploymentStats {
  
  inline def apply(
    allocation_status: MlTrainedModelDeploymentAllocationStatus,
    error_count: integer,
    inference_count: integer,
    model_id: Id,
    nodes: MlTrainedModelDeploymentNodesStats,
    number_of_allocations: integer,
    queue_capacity: integer,
    reason: String,
    rejected_execution_count: integer,
    start_time: EpochTime[UnitMillis],
    state: MlDeploymentState,
    threads_per_allocation: integer,
    timeout_count: integer
  ): MlTrainedModelDeploymentStats = {
    val __obj = js.Dynamic.literal(allocation_status = allocation_status.asInstanceOf[js.Any], error_count = error_count.asInstanceOf[js.Any], inference_count = inference_count.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], number_of_allocations = number_of_allocations.asInstanceOf[js.Any], queue_capacity = queue_capacity.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], rejected_execution_count = rejected_execution_count.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], threads_per_allocation = threads_per_allocation.asInstanceOf[js.Any], timeout_count = timeout_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelDeploymentStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTrainedModelDeploymentStats] (val x: Self) extends AnyVal {
    
    inline def setAllocation_status(value: MlTrainedModelDeploymentAllocationStatus): Self = StObject.set(x, "allocation_status", value.asInstanceOf[js.Any])
    
    inline def setError_count(value: integer): Self = StObject.set(x, "error_count", value.asInstanceOf[js.Any])
    
    inline def setInference_count(value: integer): Self = StObject.set(x, "inference_count", value.asInstanceOf[js.Any])
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: MlTrainedModelDeploymentNodesStats): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_allocations(value: integer): Self = StObject.set(x, "number_of_allocations", value.asInstanceOf[js.Any])
    
    inline def setQueue_capacity(value: integer): Self = StObject.set(x, "queue_capacity", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRejected_execution_count(value: integer): Self = StObject.set(x, "rejected_execution_count", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setState(value: MlDeploymentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setThreads_per_allocation(value: integer): Self = StObject.set(x, "threads_per_allocation", value.asInstanceOf[js.Any])
    
    inline def setTimeout_count(value: integer): Self = StObject.set(x, "timeout_count", value.asInstanceOf[js.Any])
  }
}
