package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelAssignment extends StObject {
  
  var assignment_state: MlDeploymentAssignmentState
  
  var routing_table: Record[String, MlTrainedModelAssignmentRoutingTable]
  
  var start_time: DateTime
  
  var task_parameters: MlTrainedModelAssignmentTaskParameters
}
object MlTrainedModelAssignment {
  
  inline def apply(
    assignment_state: MlDeploymentAssignmentState,
    routing_table: Record[String, MlTrainedModelAssignmentRoutingTable],
    start_time: DateTime,
    task_parameters: MlTrainedModelAssignmentTaskParameters
  ): MlTrainedModelAssignment = {
    val __obj = js.Dynamic.literal(assignment_state = assignment_state.asInstanceOf[js.Any], routing_table = routing_table.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], task_parameters = task_parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTrainedModelAssignment] (val x: Self) extends AnyVal {
    
    inline def setAssignment_state(value: MlDeploymentAssignmentState): Self = StObject.set(x, "assignment_state", value.asInstanceOf[js.Any])
    
    inline def setRouting_table(value: Record[String, MlTrainedModelAssignmentRoutingTable]): Self = StObject.set(x, "routing_table", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: DateTime): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setTask_parameters(value: MlTrainedModelAssignmentTaskParameters): Self = StObject.set(x, "task_parameters", value.asInstanceOf[js.Any])
  }
}
