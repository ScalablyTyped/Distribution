package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CallbackError event.
  */
trait ASPxClientGlobalCallbackErrorEventArgs extends ASPxClientCallbackErrorEventArgs {
  /**
    * Gets an object that initiated a callback.
    * Value: An <see cref="ASPxClientControl" /> class descendant object that is the control that initiated a callback.
    */
  var control: ASPxClientControl
}

object ASPxClientGlobalCallbackErrorEventArgs {
  @scala.inline
  def apply(control: ASPxClientControl, handled: scala.Boolean, message: java.lang.String): ASPxClientGlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ASPxClientGlobalCallbackErrorEventArgs]
  }
}

