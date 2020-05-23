package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a TIME field displaying the current time.
  */
trait CreateTimeFieldCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CreateTimeFieldCommand command.
    */
  def execute(): Boolean
}

object CreateTimeFieldCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CreateTimeFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CreateTimeFieldCommand]
  }
}

