package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelAssignmentRoutingTable extends StObject {
  
  var current_allocations: integer
  
  var reason: String
  
  var routing_state: MlRoutingState
  
  var target_allocations: integer
}
object MlTrainedModelAssignmentRoutingTable {
  
  inline def apply(
    current_allocations: integer,
    reason: String,
    routing_state: MlRoutingState,
    target_allocations: integer
  ): MlTrainedModelAssignmentRoutingTable = {
    val __obj = js.Dynamic.literal(current_allocations = current_allocations.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], routing_state = routing_state.asInstanceOf[js.Any], target_allocations = target_allocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelAssignmentRoutingTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTrainedModelAssignmentRoutingTable] (val x: Self) extends AnyVal {
    
    inline def setCurrent_allocations(value: integer): Self = StObject.set(x, "current_allocations", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRouting_state(value: MlRoutingState): Self = StObject.set(x, "routing_state", value.asInstanceOf[js.Any])
    
    inline def setTarget_allocations(value: integer): Self = StObject.set(x, "target_allocations", value.asInstanceOf[js.Any])
  }
}
