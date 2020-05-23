package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains control requests' settings.
  */
@JSGlobal("RequestSettings")
@js.native
class RequestSettings ()
  extends typings.devexpressWeb.RequestSettings {
  /**
    * Specifies the maximum number of commands that can be sent in one request.
    */
  /* CompleteClass */
  override var maxCommandCount: Double = js.native
  /**
    * Specifies a period before a request is sent to the server.
    */
  /* CompleteClass */
  override var pendingPeriod: Double = js.native
  /**
    * Specifies the time that the control waits for a response before to sent a request again.
    */
  /* CompleteClass */
  override var responseWaitingTime: Double = js.native
}

