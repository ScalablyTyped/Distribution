package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete the text in a selected range.
  */
trait DeleteCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteCommand command.
    */
  def execute(): Boolean
}

object DeleteCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteCommand]
  }
}

