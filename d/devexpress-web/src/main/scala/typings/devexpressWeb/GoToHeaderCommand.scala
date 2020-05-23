package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the page header from the page footer in the header/footer editing mode.
  */
trait GoToHeaderCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToHeaderCommand command.
    */
  def execute(): Boolean
}

object GoToHeaderCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToHeaderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToHeaderCommand]
  }
}

