package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change cell shading in the selected table elements.
  */
@JSGlobal("ChangeTableCellShadingCommand")
@js.native
class ChangeTableCellShadingCommand () extends CommandBase {
  /**
    * Executes the ChangeTableCellShadingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying the color of the selected cells' shading. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}

