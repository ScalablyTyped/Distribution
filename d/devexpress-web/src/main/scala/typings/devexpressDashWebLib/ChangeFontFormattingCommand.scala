package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font formatting of characters in a selected range.
  */
trait ChangeFontFormattingCommand extends CommandBase {
  /**
    * Executes the ChangeFontFormattingCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A  FontFormattingSettings object specifying font formatting settings.
    */
  def execute(settings: FontFormattingSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFontFormattingCommand {
  @scala.inline
  def apply(execute: js.Function1[FontFormattingSettings, scala.Boolean], getState: js.Function0[js.Any]): ChangeFontFormattingCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeFontFormattingCommand]
  }
}

