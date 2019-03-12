package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's outline width.
  */
trait ChangeFloatingObjectOutlineWidthCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectOutlineWidthCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param width An integer value specifying the outline width.
    */
  def execute(width: scala.Double): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectOutlineWidthCommand {
  @scala.inline
  def apply(execute: scala.Double => scala.Boolean, getState: () => js.Any): ChangeFloatingObjectOutlineWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectOutlineWidthCommand]
  }
}

