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
  def apply(execute: Margins => scala.Boolean, getState: () => js.Any): ChangeTextBoxContentMarginsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeTextBoxContentMarginsCommand]
  }
}

