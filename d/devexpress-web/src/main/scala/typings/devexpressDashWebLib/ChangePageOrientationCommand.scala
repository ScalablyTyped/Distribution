package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the page orientation.
  */
trait ChangePageOrientationCommand extends CommandBase {
  /**
    * Executes the ChangePageOrientationCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param isPortrait One of the Orientation enumeration values.
    */
  def execute(isPortrait: js.Any): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangePageOrientationCommand {
  @scala.inline
  def apply(execute: js.Any => scala.Boolean, getState: () => js.Any): ChangePageOrientationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangePageOrientationCommand]
  }
}

