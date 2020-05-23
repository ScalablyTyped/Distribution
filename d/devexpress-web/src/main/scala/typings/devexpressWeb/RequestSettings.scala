package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains control requests' settings.
  */
trait RequestSettings extends js.Object {
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
  @scala.inline
  def apply(maxCommandCount: Double, pendingPeriod: Double, responseWaitingTime: Double): RequestSettings = {
    val __obj = js.Dynamic.literal(maxCommandCount = maxCommandCount.asInstanceOf[js.Any], pendingPeriod = pendingPeriod.asInstanceOf[js.Any], responseWaitingTime = responseWaitingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSettings]
  }
}

