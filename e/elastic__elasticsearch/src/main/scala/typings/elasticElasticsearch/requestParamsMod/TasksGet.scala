package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksGet
  extends StObject
     with Generic {
  
  var task_id: String
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object TasksGet {
  
  @scala.inline
  def apply(task_id: String): TasksGet = {
    val __obj = js.Dynamic.literal(task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksGet]
  }
  
  @scala.inline
  implicit class TasksGetMutableBuilder[Self <: TasksGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTask_id(value: String): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
