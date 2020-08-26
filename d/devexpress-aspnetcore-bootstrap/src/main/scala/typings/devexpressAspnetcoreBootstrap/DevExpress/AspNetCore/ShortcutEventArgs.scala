package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortcutEventArgs extends EventArgs {
  val commandName: String = js.native
  val handled: Boolean = js.native
  val htmlEvent: js.Object = js.native
}

object ShortcutEventArgs {
  @scala.inline
  def apply(commandName: String, handled: Boolean, htmlEvent: js.Object, sender: Control): ShortcutEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutEventArgs]
  }
  @scala.inline
  implicit class ShortcutEventArgsOps[Self <: ShortcutEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlEvent(value: js.Object): Self = this.set("htmlEvent", value.asInstanceOf[js.Any])
  }
  
}

