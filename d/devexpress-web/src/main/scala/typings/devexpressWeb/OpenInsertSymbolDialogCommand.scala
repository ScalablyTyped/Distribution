package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Symbols dialog.
  */
trait OpenInsertSymbolDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenInsertSymbolDialogCommand command.
    */
  def execute(): Boolean
}

object OpenInsertSymbolDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertSymbolDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertSymbolDialogCommand]
  }
}

