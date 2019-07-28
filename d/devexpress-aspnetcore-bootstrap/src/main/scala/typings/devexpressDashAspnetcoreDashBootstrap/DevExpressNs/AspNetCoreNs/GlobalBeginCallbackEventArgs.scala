package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalBeginCallbackEventArgs extends BeginCallbackEventArgs {
  val control: Control
}

object GlobalBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, control: Control, sender: Control): GlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command, control = control, sender = sender)
  
    __obj.asInstanceOf[GlobalBeginCallbackEventArgs]
  }
}

