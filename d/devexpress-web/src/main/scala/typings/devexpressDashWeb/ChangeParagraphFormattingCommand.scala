package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the formatting of paragraphs in a selected range.
  */
trait ChangeParagraphFormattingCommand extends CommandBase {
  /**
    * Executes the ChangeParagraphFormattingCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A ParagraphFormattingSettings object specifying paragraph formatting settings.
    */
  def execute(settings: ParagraphFormattingSettings): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeParagraphFormattingCommand {
  @scala.inline
  def apply(execute: ParagraphFormattingSettings => Boolean, getState: () => js.Any): ChangeParagraphFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeParagraphFormattingCommand]
  }
}

