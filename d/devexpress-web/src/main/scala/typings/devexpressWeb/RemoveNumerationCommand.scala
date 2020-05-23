package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to remove the selected numeration.
  */
trait RemoveNumerationCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the RemoveNumerationCommand command.
    */
  def execute(): Boolean
}

object RemoveNumerationCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveNumerationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveNumerationCommand]
  }
}

