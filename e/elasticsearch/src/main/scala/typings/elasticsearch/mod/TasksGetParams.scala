package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasksGetParams extends GenericParams {
  
  var taskId: js.UndefOr[String] = js.native
  
  var waitForCompletion: js.UndefOr[Boolean] = js.native
}
object TasksGetParams {
  
  @scala.inline
  def apply(): TasksGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksGetParams]
  }
  
  @scala.inline
  implicit class TasksGetParamsMutableBuilder[Self <: TasksGetParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
  }
}
