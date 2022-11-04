package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksTaskInfo extends StObject {
  
  var action: String
  
  var cancellable: Boolean
  
  var cancelled: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var headers: Record[String, String]
  
  var id: long
  
  var node: NodeId
  
  var parent_task_id: js.UndefOr[TaskId] = js.undefined
  
  var running_time: js.UndefOr[Duration] = js.undefined
  
  var running_time_in_nanos: DurationValue[UnitNanos]
  
  var start_time_in_millis: EpochTime[UnitMillis]
  
  var status: js.UndefOr[TasksTaskStatus] = js.undefined
  
  var `type`: String
}
object TasksTaskInfo {
  
  inline def apply(
    action: String,
    cancellable: Boolean,
    headers: Record[String, String],
    id: long,
    node: NodeId,
    running_time_in_nanos: DurationValue[UnitNanos],
    start_time_in_millis: EpochTime[UnitMillis],
    `type`: String
  ): TasksTaskInfo = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cancellable = cancellable.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], running_time_in_nanos = running_time_in_nanos.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksTaskInfo]
  }
  
  extension [Self <: TasksTaskInfo](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setId(value: long): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NodeId): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent_task_id(value: TaskId): Self = StObject.set(x, "parent_task_id", value.asInstanceOf[js.Any])
    
    inline def setParent_task_idUndefined: Self = StObject.set(x, "parent_task_id", js.undefined)
    
    inline def setRunning_time(value: Duration): Self = StObject.set(x, "running_time", value.asInstanceOf[js.Any])
    
    inline def setRunning_timeUndefined: Self = StObject.set(x, "running_time", js.undefined)
    
    inline def setRunning_time_in_nanos(value: DurationValue[UnitNanos]): Self = StObject.set(x, "running_time_in_nanos", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TasksTaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
