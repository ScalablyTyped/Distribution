package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the background color of paragraphs in a selected range.
  */
trait ChangeParagraphBackColorCommand extends CommandBase {
  /**
    * Executes the ChangeParagraphBackColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying a background color of the paragraphs in a selected range. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String]
}

object ChangeParagraphBackColorCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => CommandState[String]): ChangeParagraphBackColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeParagraphBackColorCommand]
  }
}

