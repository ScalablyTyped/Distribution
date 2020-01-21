package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditKeyEventArgs extends EventArgs {
  val htmlEvent: js.Any
}

object EditKeyEventArgs {
  @scala.inline
  def apply(htmlEvent: js.Any, sender: Control): EditKeyEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditKeyEventArgs]
  }
}

