package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attempt extends StObject {
  
  var dispatchTime: String = js.native
  
  var responseStatus: Status = js.native
  
  var responseTime: String = js.native
  
  var scheduleTime: String = js.native
}
object Attempt {
  
  @scala.inline
  def apply(dispatchTime: String, responseStatus: Status, responseTime: String, scheduleTime: String): Attempt = {
    val __obj = js.Dynamic.literal(dispatchTime = dispatchTime.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], scheduleTime = scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempt]
  }
  
  @scala.inline
  implicit class AttemptMutableBuilder[Self <: Attempt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatchTime(value: String): Self = StObject.set(x, "dispatchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatus(value: Status): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTime(value: String): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
  }
}
