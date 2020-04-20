package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutEventArgs extends EventArgs {
  val commandName: String
  val handled: Boolean
  val htmlEvent: js.Object
}

object ShortcutEventArgs {
  @scala.inline
  def apply(commandName: String, handled: Boolean, htmlEvent: js.Object, sender: Control): ShortcutEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutEventArgs]
  }
}

