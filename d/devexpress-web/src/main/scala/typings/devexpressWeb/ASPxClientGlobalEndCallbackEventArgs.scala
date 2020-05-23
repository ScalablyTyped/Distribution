package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.EndCallback event.
  */
trait ASPxClientGlobalEndCallbackEventArgs extends ASPxClientEndCallbackEventArgs {
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl
}

object ASPxClientGlobalEndCallbackEventArgs {
  @scala.inline
  def apply(command: String, control: ASPxClientControl): ASPxClientGlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalEndCallbackEventArgs]
  }
}

