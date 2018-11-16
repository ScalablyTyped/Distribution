package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to change the selected table's formatting.
 */

trait ChangeTableFormattingCommand extends CommandBase {
  /**
       * Executes the ChangeTableFormattingCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param settings A TableFormattingSettings object containing the settings to format a table.
       */
  def execute(settings: TableFormattingSettings): scala.Boolean
  /**
       * Gets information about the command state.
       */
  def getState(): js.Any
}

