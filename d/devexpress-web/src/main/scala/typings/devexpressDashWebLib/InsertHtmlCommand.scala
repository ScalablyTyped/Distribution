package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to add an HTML formatted content in place of a selected range.
 */

trait InsertHtmlCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the InsertHtmlCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param html A string that specifies the inserted HTML code.
       */
  def execute(html: java.lang.String): scala.Boolean
}

