package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksParentTaskInfo
  extends StObject
     with TasksTaskInfo {
  
  var children: js.UndefOr[js.Array[TasksTaskInfo]] = js.undefined
}
object TasksParentTaskInfo {
  
  inline def apply(
    action: String,
    cancellable: Boolean,
    headers: Record[String, String],
    id: long,
    node: NodeId,
    running_time_in_nanos: DurationValue[UnitNanos],
    start_time_in_millis: EpochTime[UnitMillis],
    `type`: String
  ): TasksParentTaskInfo = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cancellable = cancellable.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], running_time_in_nanos = running_time_in_nanos.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksParentTaskInfo]
  }
  
  extension [Self <: TasksParentTaskInfo](x: Self) {
    
    inline def setChildren(value: js.Array[TasksTaskInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: TasksTaskInfo*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
