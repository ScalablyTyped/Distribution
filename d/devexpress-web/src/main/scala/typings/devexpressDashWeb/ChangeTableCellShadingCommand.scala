package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change cell shading in the selected table elements.
  */
trait ChangeTableCellShadingCommand extends CommandBase {
  /**
    * Executes the ChangeTableCellShadingCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param color A string specifying the color of the selected cells' shading. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTableCellShadingCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => js.Any): ChangeTableCellShadingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeTableCellShadingCommand]
  }
}

