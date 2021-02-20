package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends StObject {
  
  var appEngineHttpRequest: AppEngineHttpRequest = js.native
  
  var createTime: String = js.native
  
  var dispatchCount: Double = js.native
  
  var firstAttempt: Attempt = js.native
  
  var lastAttempt: Attempt = js.native
  
  var name: String = js.native
  
  var responseCount: Double = js.native
  
  var scheduleTime: String = js.native
  
  var view: View = js.native
}
object Task {
  
  @scala.inline
  def apply(
    appEngineHttpRequest: AppEngineHttpRequest,
    createTime: String,
    dispatchCount: Double,
    firstAttempt: Attempt,
    lastAttempt: Attempt,
    name: String,
    responseCount: Double,
    scheduleTime: String,
    view: View
  ): Task = {
    val __obj = js.Dynamic.literal(appEngineHttpRequest = appEngineHttpRequest.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], dispatchCount = dispatchCount.asInstanceOf[js.Any], firstAttempt = firstAttempt.asInstanceOf[js.Any], lastAttempt = lastAttempt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], responseCount = responseCount.asInstanceOf[js.Any], scheduleTime = scheduleTime.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppEngineHttpRequest(value: AppEngineHttpRequest): Self = StObject.set(x, "appEngineHttpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchCount(value: Double): Self = StObject.set(x, "dispatchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstAttempt(value: Attempt): Self = StObject.set(x, "firstAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAttempt(value: Attempt): Self = StObject.set(x, "lastAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCount(value: Double): Self = StObject.set(x, "responseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
