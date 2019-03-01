package typings
package devexpressDashWebLib

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
  def execute(settings: ParagraphFormattingSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeParagraphFormattingCommand {
  @scala.inline
  def apply(execute: js.Function1[ParagraphFormattingSettings, scala.Boolean], getState: js.Function0[js.Any]): ChangeParagraphFormattingCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeParagraphFormattingCommand]
  }
}

