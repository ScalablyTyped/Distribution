package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides information about a command available in the toolbar or menu.
 */

trait ASPxClientMenuAction extends js.Object {
  /**
       * Provides access to the action performed when a button is clicked.
       * Value: The specific action implementation.
       */
  var clickAction: js.Function
  /**
       * Provides access to a value that specifies the command location.
       * Value: A string that specifies the command location.
       */
  var container: java.lang.String
  /**
       * Provides access to the value that specifies whether or not the command is disabled by default.
       * Value: true, if the command is disabled by default; otherwise, false.
       */
  var disabled: scala.Boolean
  /**
       * Specifies whether or not the command has a visual separator.
       * Value: true, if the command has a visual separator; otherwise, false.
       */
  var hasSeparator: scala.Boolean
  /**
       * Provides access to the keyboard shortcut used to invoke the command.
       * Value: An ASPxClientMenuActionHotKey object that specifies the keyboard shortcut.
       */
  var hotKey: ASPxClientMenuActionHotKey
  /**
       * Provides access to the CSS class of the command's glyph.
       * Value: A string that specifies the name of the CSS class.
       */
  var imageClassName: java.lang.String
  /**
       * Provides access to the text for the command.
       * Value: A string that is the command text.
       */
  var text: java.lang.String
  /**
       * Provides access to the value that specifies whether or not the command is visible in the user interface.
       * Value: true if the command is visible; otherwise false.
       */
  var visible: scala.Boolean
}

