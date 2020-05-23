package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's background fill color.
  */
trait ChangeFloatingObjectFillColorCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectFillColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string value specifying the color.
    */
  def execute(color: String): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String]
}

object ChangeFloatingObjectFillColorCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => CommandState[String]): ChangeFloatingObjectFillColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectFillColorCommand]
  }
}

