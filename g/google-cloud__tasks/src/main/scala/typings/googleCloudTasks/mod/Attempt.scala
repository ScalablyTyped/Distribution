package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attempt extends StObject {
  
  var dispatchTime: String
  
  var responseStatus: Status
  
  var responseTime: String
  
  var scheduleTime: String
}
object Attempt {
  
  inline def apply(dispatchTime: String, responseStatus: Status, responseTime: String, scheduleTime: String): Attempt = {
    val __obj = js.Dynamic.literal(dispatchTime = dispatchTime.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], scheduleTime = scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attempt] (val x: Self) extends AnyVal {
    
    inline def setDispatchTime(value: String): Self = StObject.set(x, "dispatchTime", value.asInstanceOf[js.Any])
    
    inline def setResponseStatus(value: Status): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setResponseTime(value: String): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
  }
}
