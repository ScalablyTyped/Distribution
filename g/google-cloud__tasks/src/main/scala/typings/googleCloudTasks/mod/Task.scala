package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  var appEngineHttpRequest: AppEngineHttpRequest
  
  var createTime: String
  
  var dispatchCount: Double
  
  var firstAttempt: Attempt
  
  var lastAttempt: Attempt
  
  var name: String
  
  var responseCount: Double
  
  var scheduleTime: String
  
  var view: View
}
object Task {
  
  inline def apply(
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
  
  extension [Self <: Task](x: Self) {
    
    inline def setAppEngineHttpRequest(value: AppEngineHttpRequest): Self = StObject.set(x, "appEngineHttpRequest", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setDispatchCount(value: Double): Self = StObject.set(x, "dispatchCount", value.asInstanceOf[js.Any])
    
    inline def setFirstAttempt(value: Attempt): Self = StObject.set(x, "firstAttempt", value.asInstanceOf[js.Any])
    
    inline def setLastAttempt(value: Attempt): Self = StObject.set(x, "lastAttempt", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResponseCount(value: Double): Self = StObject.set(x, "responseCount", value.asInstanceOf[js.Any])
    
    inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
