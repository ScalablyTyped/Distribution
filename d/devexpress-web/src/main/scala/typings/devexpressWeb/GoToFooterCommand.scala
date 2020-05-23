package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the page footer from the page header in the header/footer editing mode.
  */
trait GoToFooterCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToFooterCommand command.
    */
  def execute(): Boolean
}

object GoToFooterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToFooterCommand]
  }
}

