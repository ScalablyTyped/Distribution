package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the formatting of paragraphs in a selected range.
  */
trait ChangeParagraphFormattingCommand extends CommandBase {
  /**
    * Executes the ChangeParagraphFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A ParagraphFormattingSettings object specifying paragraph formatting settings.
    */
  def execute(settings: ParagraphFormattingSettings): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[ParagraphFormattingSettings]
}

object ChangeParagraphFormattingCommand {
  @scala.inline
  def apply(
    execute: ParagraphFormattingSettings => Boolean,
    getState: () => CommandState[ParagraphFormattingSettings]
  ): ChangeParagraphFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeParagraphFormattingCommand]
  }
}

