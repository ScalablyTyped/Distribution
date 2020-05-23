package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Layout dialog.
  */
trait OpenLayoutOptionsDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenLayoutOptionsDialogCommand command.
    */
  def execute(): Boolean
}

object OpenLayoutOptionsDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenLayoutOptionsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenLayoutOptionsDialogCommand]
  }
}

