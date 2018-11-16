package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to insert text at the current position in the document.
 */

trait InsertTextCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the InsertTextCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param text A string value specifying a text to insert.
       */
  def execute(text: java.lang.String): scala.Boolean
}

