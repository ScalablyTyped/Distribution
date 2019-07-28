package typings.devexpressDashWeb

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
  def execute(width: Double): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectOutlineWidthCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => js.Any): ChangeFloatingObjectOutlineWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectOutlineWidthCommand]
  }
}

