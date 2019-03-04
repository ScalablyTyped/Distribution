package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeginCallback event.
  */
trait ASPxClientGlobalBeginCallbackEventArgs extends ASPxClientBeginCallbackEventArgs {
  /**
    * Gets an object that initiated a callback.
    * Value: An <see cref="ASPxClientControl" /> class descendant object that is the control that initiated a callback.
    */
  var control: ASPxClientControl
}

object ASPxClientGlobalBeginCallbackEventArgs {
  @scala.inline
  def apply(command: java.lang.String, control: ASPxClientControl): ASPxClientGlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command, control = control)
  
    __obj.asInstanceOf[ASPxClientGlobalBeginCallbackEventArgs]
  }
}

