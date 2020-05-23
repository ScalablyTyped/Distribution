package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to move the cursor backwards and erase the character in that space.
  */
trait BackspaceCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the BackspaceCommand command.
    */
  def execute(): Boolean
}

object BackspaceCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): BackspaceCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[BackspaceCommand]
  }
}

