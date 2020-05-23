package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a text box' content margins.
  */
trait ChangeTextBoxContentMarginsCommand extends CommandBase {
  /**
    * Executes the ChangeTextBoxContentMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A Margins object specifying margin settings.
    */
  def execute(settings: Margins): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Margins]
}

object ChangeTextBoxContentMarginsCommand {
  @scala.inline
  def apply(execute: Margins => Boolean, getState: () => CommandState[Margins]): ChangeTextBoxContentMarginsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTextBoxContentMarginsCommand]
  }
}

