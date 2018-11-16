package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the client-side Shortcut event.
 */

trait ShortcutEventArgs extends ASPxClientEventArgs {
  /**
       * Gets the name of a command associated with the keyboard shortcut.
       * Value: A string containing a command name.
       */
  var commandName: java.lang.String
  /**
       * Gets or sets whether an event is handled, and that default actions are not required.
       * Value: true, if no default processing is required; otherwise, false.
       */
  var handled: scala.Boolean
  /**
       * Gets an object containing information about a keyboard shortcut event.
       * Value: An object containing event data.
       */
  var htmlEvent: js.Object
}

