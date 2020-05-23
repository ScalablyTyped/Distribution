package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to switch the text case at the current position in the document.
  */
trait SwitchTextCaseCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the SwitchTextCaseCommand command.
    */
  def execute(): Boolean
}

object SwitchTextCaseCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): SwitchTextCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SwitchTextCaseCommand]
  }
}

