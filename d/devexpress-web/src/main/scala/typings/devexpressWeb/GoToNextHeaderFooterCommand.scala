package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the next page header or footer in the header/footer editing mode.
  */
trait GoToNextHeaderFooterCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToNextHeaderFooterCommand command.
    */
  def execute(): Boolean
}

object GoToNextHeaderFooterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToNextHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToNextHeaderFooterCommand]
  }
}

