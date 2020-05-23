package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font size of characters in a selected range.
  */
trait ChangeFontSizeCommand extends CommandBase {
  /**
    * Executes the ChangeFontSizeCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontSize An integer number specifying the font size in points.
    */
  def execute(fontSize: Double): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double]
}

object ChangeFontSizeCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => CommandState[Double]): ChangeFontSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFontSizeCommand]
  }
}

