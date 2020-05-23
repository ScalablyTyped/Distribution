package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to fit the specified table to its contents.
  */
trait ToggleTableAutoFitContentsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ToggleTableAutoFitContentsCommand command.
    */
  def execute(): Boolean
}

object ToggleTableAutoFitContentsCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTableAutoFitContentsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableAutoFitContentsCommand]
  }
}

