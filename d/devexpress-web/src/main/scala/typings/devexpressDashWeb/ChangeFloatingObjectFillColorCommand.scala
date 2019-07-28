package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's background fill color.
  */
trait ChangeFloatingObjectFillColorCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectFillColorCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param color A string value specifying the color.
    */
  def execute(color: String): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectFillColorCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => js.Any): ChangeFloatingObjectFillColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectFillColorCommand]
  }
}

