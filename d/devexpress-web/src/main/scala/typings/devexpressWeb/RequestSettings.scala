package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains control requests' settings.
  */
@js.native
trait RequestSettings extends StObject {
  
  /**
    * Specifies the maximum number of commands that can be sent in one request.
    */
  var maxCommandCount: Double = js.native
  
  /**
    * Specifies a period before a request is sent to the server.
    */
  var pendingPeriod: Double = js.native
  
  /**
    * Specifies the time that the control waits for a response before to sent a request again.
    */
  var responseWaitingTime: Double = js.native
}
object RequestSettings {
  
  @scala.inline
  def apply(maxCommandCount: Double, pendingPeriod: Double, responseWaitingTime: Double): RequestSettings = {
    val __obj = js.Dynamic.literal(maxCommandCount = maxCommandCount.asInstanceOf[js.Any], pendingPeriod = pendingPeriod.asInstanceOf[js.Any], responseWaitingTime = responseWaitingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSettings]
  }
  
  @scala.inline
  implicit class RequestSettingsMutableBuilder[Self <: RequestSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCommandCount(value: Double): Self = StObject.set(x, "maxCommandCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingPeriod(value: Double): Self = StObject.set(x, "pendingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseWaitingTime(value: Double): Self = StObject.set(x, "responseWaitingTime", value.asInstanceOf[js.Any])
  }
}
