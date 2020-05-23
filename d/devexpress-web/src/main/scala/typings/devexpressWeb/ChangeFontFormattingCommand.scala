package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font formatting of characters in a selected range.
  */
trait ChangeFontFormattingCommand extends CommandBase {
  /**
    * Executes the ChangeFontFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A  FontFormattingSettings object specifying font formatting settings.
    */
  def execute(settings: FontFormattingSettings): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[FontFormattingSettings]
}

object ChangeFontFormattingCommand {
  @scala.inline
  def apply(execute: FontFormattingSettings => Boolean, getState: () => CommandState[FontFormattingSettings]): ChangeFontFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFontFormattingCommand]
  }
}

