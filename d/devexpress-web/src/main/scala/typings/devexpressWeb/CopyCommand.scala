package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to copy the selected text and place it to the clipboard.
  */
trait CopyCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CopyCommand command.
    */
  def execute(): Boolean
}

object CopyCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CopyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CopyCommand]
  }
}

