package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksTaskListResponseBase extends StObject {
  
  var node_failures: js.UndefOr[js.Array[ErrorCause]] = js.undefined
  
  var nodes: js.UndefOr[Record[String, TasksNodeTasks]] = js.undefined
  
  var task_failures: js.UndefOr[js.Array[TaskFailure]] = js.undefined
  
  var tasks: js.UndefOr[TasksTaskInfos] = js.undefined
}
object TasksTaskListResponseBase {
  
  inline def apply(): TasksTaskListResponseBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksTaskListResponseBase]
  }
  
  extension [Self <: TasksTaskListResponseBase](x: Self) {
    
    inline def setNode_failures(value: js.Array[ErrorCause]): Self = StObject.set(x, "node_failures", value.asInstanceOf[js.Any])
    
    inline def setNode_failuresUndefined: Self = StObject.set(x, "node_failures", js.undefined)
    
    inline def setNode_failuresVarargs(value: ErrorCause*): Self = StObject.set(x, "node_failures", js.Array(value*))
    
    inline def setNodes(value: Record[String, TasksNodeTasks]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setTask_failures(value: js.Array[TaskFailure]): Self = StObject.set(x, "task_failures", value.asInstanceOf[js.Any])
    
    inline def setTask_failuresUndefined: Self = StObject.set(x, "task_failures", js.undefined)
    
    inline def setTask_failuresVarargs(value: TaskFailure*): Self = StObject.set(x, "task_failures", js.Array(value*))
    
    inline def setTasks(value: TasksTaskInfos): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: TasksTaskInfo*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
