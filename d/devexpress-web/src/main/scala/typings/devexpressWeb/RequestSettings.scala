package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains control requests' settings.
  */
trait RequestSettings extends StObject {
  
  /**
    * Specifies the maximum number of commands that can be sent in one request.
    */
  var maxCommandCount: Double
  
  /**
    * Specifies a period before a request is sent to the server.
    */
  var pendingPeriod: Double
  
  /**
    * Specifies the time that the control waits for a response before to sent a request again.
    */
  var responseWaitingTime: Double
}
object RequestSettings {
  
  inline def apply(maxCommandCount: Double, pendingPeriod: Double, responseWaitingTime: Double): RequestSettings = {
    val __obj = js.Dynamic.literal(maxCommandCount = maxCommandCount.asInstanceOf[js.Any], pendingPeriod = pendingPeriod.asInstanceOf[js.Any], responseWaitingTime = responseWaitingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestSettings] (val x: Self) extends AnyVal {
    
    inline def setMaxCommandCount(value: Double): Self = StObject.set(x, "maxCommandCount", value.asInstanceOf[js.Any])
    
    inline def setPendingPeriod(value: Double): Self = StObject.set(x, "pendingPeriod", value.asInstanceOf[js.Any])
    
    inline def setResponseWaitingTime(value: Double): Self = StObject.set(x, "responseWaitingTime", value.asInstanceOf[js.Any])
  }
}
