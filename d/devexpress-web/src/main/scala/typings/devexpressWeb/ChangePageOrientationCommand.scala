package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the page orientation.
  */
@JSGlobal("ChangePageOrientationCommand")
@js.native
class ChangePageOrientationCommand () extends CommandBase {
  /**
    * Executes the ChangePageOrientationCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param orientation The page orientation.
    */
  def execute(orientation: Orientation): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Orientation] = js.native
}

