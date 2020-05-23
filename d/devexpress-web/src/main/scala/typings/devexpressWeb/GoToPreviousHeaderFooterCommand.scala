package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the previous page header or footer in the header/footer editing mode.
  */
trait GoToPreviousHeaderFooterCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToPreviousHeaderFooterCommand command.
    */
  def execute(): Boolean
}

object GoToPreviousHeaderFooterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToPreviousHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToPreviousHeaderFooterCommand]
  }
}

