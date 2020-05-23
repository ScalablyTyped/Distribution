package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a PAGE field displaying the current page number.
  */
trait CreatePageFieldCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CreatePageFieldCommand command.
    */
  def execute(): Boolean
}

object CreatePageFieldCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CreatePageFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CreatePageFieldCommand]
  }
}

