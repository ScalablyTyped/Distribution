package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the number of section columns having the same width.
  */
trait ChangeSectionEqualColumnCountCommand extends CommandBase {
  /**
    * Executes the ChangeSectionEqualColumnCountCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An interger number specifying the number of section columns having the same width.
    */
  def execute(columnCount: Double): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double]
}

object ChangeSectionEqualColumnCountCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => CommandState[Double]): ChangeSectionEqualColumnCountCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeSectionEqualColumnCountCommand]
  }
}

