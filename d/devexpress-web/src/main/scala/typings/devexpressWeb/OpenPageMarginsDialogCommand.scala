package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Margins tab of the Page Setup dialog.
  */
trait OpenPageMarginsDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenPageMarginsDialogCommand command.
    */
  def execute(): Boolean
}

object OpenPageMarginsDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenPageMarginsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenPageMarginsDialogCommand]
  }
}

