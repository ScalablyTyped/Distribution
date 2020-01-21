package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalBeginCallbackEventArgs extends BeginCallbackEventArgs {
  val control: Control
}

object GlobalBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, control: Control, sender: Control): GlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalBeginCallbackEventArgs]
  }
}

