package typings.devexpressDashWeb

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
  def execute(preferredWidth: TableWidthUnit): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTableColumnPreferredWidthCommand {
  @scala.inline
  def apply(execute: TableWidthUnit => Boolean, getState: () => js.Any): ChangeTableColumnPreferredWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeTableColumnPreferredWidthCommand]
  }
}

