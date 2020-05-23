package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to create a new empty document.
  */
trait FileNewCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FileNewCommand command.
    */
  def execute(): Boolean
}

object FileNewCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileNewCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileNewCommand]
  }
}

