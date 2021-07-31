package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains control requests' settings.
  */
@JSGlobal("RequestSettings")
@js.native
class RequestSettings ()
  extends StObject
     with typings.devexpressWeb.RequestSettings {
  
  /**
    * Specifies the maximum number of commands that can be sent in one request.
    */
  /* CompleteClass */
  var maxCommandCount: Double = js.native
  
  /**
    * Specifies a period before a request is sent to the server.
    */
  /* CompleteClass */
  var pendingPeriod: Double = js.native
  
  /**
    * Specifies the time that the control waits for a response before to sent a request again.
    */
  /* CompleteClass */
  var responseWaitingTime: Double = js.native
}
