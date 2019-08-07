package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains control requests' settings.
  */
@JSGlobal("RequestSettings")
@js.native
class RequestSettings () extends js.Object {
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

