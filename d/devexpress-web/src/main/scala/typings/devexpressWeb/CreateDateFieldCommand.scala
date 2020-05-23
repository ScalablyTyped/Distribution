package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a DATE field displaying the current date.
  */
trait CreateDateFieldCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CreateDateFieldCommand command.
    */
  def execute(): Boolean
}

object CreateDateFieldCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CreateDateFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CreateDateFieldCommand]
  }
}

