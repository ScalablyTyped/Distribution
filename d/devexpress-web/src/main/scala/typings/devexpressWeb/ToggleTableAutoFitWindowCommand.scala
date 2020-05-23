package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to fit the specified table to a document's window.
  */
trait ToggleTableAutoFitWindowCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ToggleTableAutoFitWindowCommand command.
    */
  def execute(): Boolean
}

object ToggleTableAutoFitWindowCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTableAutoFitWindowCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableAutoFitWindowCommand]
  }
}

