package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's preferred column width.
  */
trait ChangeTableColumnPreferredWidthCommand extends CommandBase {
  /**
    * Executes the ChangeTableColumnPreferredWidthCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table columns.
    */
  def execute(preferredWidth: TableWidthUnit): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

