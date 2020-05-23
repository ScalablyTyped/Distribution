package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side ASPxClientScheduler.Shortcut event.
  */
trait ShortcutEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of a command associated with the keyboard shortcut.
    */
  var commandName: String
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean
  /**
    * Gets an object containing information about a keyboard shortcut event.
    */
  var htmlEvent: js.Any
}

object ShortcutEventArgs {
  @scala.inline
  def apply(commandName: String, handled: Boolean, htmlEvent: js.Any): ShortcutEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutEventArgs]
  }
}

