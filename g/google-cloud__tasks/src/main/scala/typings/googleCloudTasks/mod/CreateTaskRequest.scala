package typings.googleCloudTasks.mod

import typings.googleCloudTasks.anon.PartialTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTaskRequest extends StObject {
  
  var parent: String = js.native
  
  var responseView: js.UndefOr[View] = js.native
  
  var task: PartialTask = js.native
}
object CreateTaskRequest {
  
  @scala.inline
  def apply(parent: String, task: PartialTask): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
  
  @scala.inline
  implicit class CreateTaskRequestMutableBuilder[Self <: CreateTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseView(value: View): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
    
    @scala.inline
    def setTask(value: PartialTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
