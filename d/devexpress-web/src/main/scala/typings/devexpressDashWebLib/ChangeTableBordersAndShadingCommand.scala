package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change borders and shading of the selected table elements.
  */
trait ChangeTableBordersAndShadingCommand extends CommandBase {
  /**
    * Executes the ChangeTableBordersAndShadingCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A TableBorderSettings object with settings specifying table borders.
    * @param applyToWholeTable true to apply the border settings to the whole table, false to apply the border settings to the selected cells.
    */
  def execute(settings: TableBordersSettings, applyToWholeTable: scala.Boolean): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTableBordersAndShadingCommand {
  @scala.inline
  def apply(execute: (TableBordersSettings, scala.Boolean) => scala.Boolean, getState: () => js.Any): ChangeTableBordersAndShadingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeTableBordersAndShadingCommand]
  }
}

