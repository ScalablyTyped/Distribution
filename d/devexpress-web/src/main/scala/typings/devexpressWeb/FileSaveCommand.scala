package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to save the document to a file.
  */
trait FileSaveCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FileSaveCommand command.
    */
  def execute(): Boolean
}

object FileSaveCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileSaveCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileSaveCommand]
  }
}

