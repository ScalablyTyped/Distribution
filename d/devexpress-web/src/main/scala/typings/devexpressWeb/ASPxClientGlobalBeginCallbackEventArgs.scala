package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
trait ASPxClientGlobalBeginCallbackEventArgs extends ASPxClientBeginCallbackEventArgs {
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl
}

object ASPxClientGlobalBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, control: ASPxClientControl): ASPxClientGlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalBeginCallbackEventArgs]
  }
}

