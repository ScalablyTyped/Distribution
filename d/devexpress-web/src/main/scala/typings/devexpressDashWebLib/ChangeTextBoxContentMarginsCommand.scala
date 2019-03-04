package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a text box' content margins.
  */
trait ChangeTextBoxContentMarginsCommand extends CommandBase {
  /**
    * Executes the ChangeTextBoxContentMarginsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A Margins object specifying margin settings.
    */
  def execute(settings: Margins): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTextBoxContentMarginsCommand {
  @scala.inline
  def apply(execute: js.Function1[Margins, scala.Boolean], getState: js.Function0[js.Any]): ChangeTextBoxContentMarginsCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[ChangeTextBoxContentMarginsCommand]
  }
}

