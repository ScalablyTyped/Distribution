package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events which can't be cancelled and allow the event's processing to be passed to the server side.
  */
trait ASPxClientProcessingModeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  var processOnServer: Boolean
}

object ASPxClientProcessingModeEventArgs {
  @scala.inline
  def apply(processOnServer: Boolean): ASPxClientProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientProcessingModeEventArgs]
  }
}

