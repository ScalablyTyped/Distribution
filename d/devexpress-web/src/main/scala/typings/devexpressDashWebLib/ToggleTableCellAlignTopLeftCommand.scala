package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to apply top-left alignment for the selected table cells.
 */

trait ToggleTableCellAlignTopLeftCommand extends CommandWithBooleanStateBase {
  /**
       * Executes the ToggleTableCellAlignTopLeftCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       */
  def execute(): scala.Boolean
}

