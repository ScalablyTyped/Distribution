package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalEndCallbackEventArgs extends EventArgs {
  val control: Control
}

object GlobalEndCallbackEventArgs {
  @scala.inline
  def apply(control: Control, sender: Control): GlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(control = control, sender = sender)
  
    __obj.asInstanceOf[GlobalEndCallbackEventArgs]
  }
}

