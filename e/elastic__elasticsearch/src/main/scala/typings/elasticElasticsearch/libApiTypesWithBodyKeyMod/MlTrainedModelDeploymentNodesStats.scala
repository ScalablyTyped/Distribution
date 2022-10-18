package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelDeploymentNodesStats extends StObject {
  
  var average_inference_time_ms: DurationValue[UnitFloatMillis]
  
  var error_count: integer
  
  var inference_count: integer
  
  var last_access: long
  
  var node: MlDiscoveryNode
  
  var number_of_allocations: integer
  
  var number_of_pending_requests: integer
  
  var rejection_execution_count: integer
  
  var routing_state: MlTrainedModelAssignmentRoutingTable
  
  var start_time: EpochTime[UnitMillis]
  
  var threads_per_allocation: integer
  
  var timeout_count: integer
}
object MlTrainedModelDeploymentNodesStats {
  
  inline def apply(
    average_inference_time_ms: DurationValue[UnitFloatMillis],
    error_count: integer,
    inference_count: integer,
    last_access: long,
    node: MlDiscoveryNode,
    number_of_allocations: integer,
    number_of_pending_requests: integer,
    rejection_execution_count: integer,
    routing_state: MlTrainedModelAssignmentRoutingTable,
    start_time: EpochTime[UnitMillis],
    threads_per_allocation: integer,
    timeout_count: integer
  ): MlTrainedModelDeploymentNodesStats = {
    val __obj = js.Dynamic.literal(average_inference_time_ms = average_inference_time_ms.asInstanceOf[js.Any], error_count = error_count.asInstanceOf[js.Any], inference_count = inference_count.asInstanceOf[js.Any], last_access = last_access.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number_of_allocations = number_of_allocations.asInstanceOf[js.Any], number_of_pending_requests = number_of_pending_requests.asInstanceOf[js.Any], rejection_execution_count = rejection_execution_count.asInstanceOf[js.Any], routing_state = routing_state.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], threads_per_allocation = threads_per_allocation.asInstanceOf[js.Any], timeout_count = timeout_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelDeploymentNodesStats]
  }
  
  extension [Self <: MlTrainedModelDeploymentNodesStats](x: Self) {
    
    inline def setAverage_inference_time_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "average_inference_time_ms", value.asInstanceOf[js.Any])
    
    inline def setError_count(value: integer): Self = StObject.set(x, "error_count", value.asInstanceOf[js.Any])
    
    inline def setInference_count(value: integer): Self = StObject.set(x, "inference_count", value.asInstanceOf[js.Any])
    
    inline def setLast_access(value: long): Self = StObject.set(x, "last_access", value.asInstanceOf[js.Any])
    
    inline def setNode(value: MlDiscoveryNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_allocations(value: integer): Self = StObject.set(x, "number_of_allocations", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_pending_requests(value: integer): Self = StObject.set(x, "number_of_pending_requests", value.asInstanceOf[js.Any])
    
    inline def setRejection_execution_count(value: integer): Self = StObject.set(x, "rejection_execution_count", value.asInstanceOf[js.Any])
    
    inline def setRouting_state(value: MlTrainedModelAssignmentRoutingTable): Self = StObject.set(x, "routing_state", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setThreads_per_allocation(value: integer): Self = StObject.set(x, "threads_per_allocation", value.asInstanceOf[js.Any])
    
    inline def setTimeout_count(value: integer): Self = StObject.set(x, "timeout_count", value.asInstanceOf[js.Any])
  }
}
