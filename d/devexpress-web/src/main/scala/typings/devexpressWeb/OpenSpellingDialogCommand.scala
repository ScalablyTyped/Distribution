package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Spelling dialog window.
  */
trait OpenSpellingDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenSpellingDialogCommand command.
    */
  def execute(): Boolean
}

object OpenSpellingDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenSpellingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenSpellingDialogCommand]
  }
}

