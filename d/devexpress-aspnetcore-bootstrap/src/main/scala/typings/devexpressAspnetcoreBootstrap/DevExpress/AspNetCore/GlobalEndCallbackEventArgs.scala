package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalEndCallbackEventArgs extends EventArgs {
  val control: Control
}

object GlobalEndCallbackEventArgs {
  @scala.inline
  def apply(control: Control, sender: Control): GlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalEndCallbackEventArgs]
  }
}

