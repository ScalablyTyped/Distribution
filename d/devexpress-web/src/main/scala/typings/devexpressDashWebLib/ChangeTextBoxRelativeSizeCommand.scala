package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a text box' relative size settings.
  */
trait ChangeTextBoxRelativeSizeCommand extends CommandBase {
  /**
    * Executes the ChangeTextBoxRelativeSizeCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A TextBoxRelativeSizeSettings object specifying relative size settings.
    */
  def execute(settings: TextBoxRelativeSizeSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTextBoxRelativeSizeCommand {
  @scala.inline
  def apply(execute: js.Function1[TextBoxRelativeSizeSettings, scala.Boolean], getState: js.Function0[js.Any]): ChangeTextBoxRelativeSizeCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeTextBoxRelativeSizeCommand]
  }
}

