package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(commandName = commandName, handled = handled, htmlEvent = htmlEvent, sender = sender)
  
    __obj.asInstanceOf[ShortcutEventArgs]
  }
}

