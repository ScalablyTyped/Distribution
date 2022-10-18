package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksGetResponse extends StObject {
  
  var completed: Boolean
  
  var error: js.UndefOr[ErrorCause] = js.undefined
  
  var response: js.UndefOr[TasksTaskStatus] = js.undefined
  
  var task: TasksTaskInfo
}
object TasksGetResponse {
  
  inline def apply(completed: Boolean, task: TasksTaskInfo): TasksGetResponse = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksGetResponse]
  }
  
  extension [Self <: TasksGetResponse](x: Self) {
    
    inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setResponse(value: TasksTaskStatus): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setTask(value: TasksTaskInfo): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
