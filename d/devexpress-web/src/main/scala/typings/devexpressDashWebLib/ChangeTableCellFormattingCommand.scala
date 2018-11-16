package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to change the cell formatting of the selected table elements.
 */

trait ChangeTableCellFormattingCommand extends CommandBase {
  /**
       * Executes the ChangeTableCellFormattingCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param settings A TableFormattingSettings object specifying cell formatting of the selected table elements.
       */
  def execute(settings: TableCellFormattingSettings): scala.Boolean
  /**
       * Gets information about the command state.
       */
  def getState(): js.Any
}

