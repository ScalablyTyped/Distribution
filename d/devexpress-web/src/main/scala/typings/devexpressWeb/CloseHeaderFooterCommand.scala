package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to finish header/footer editing.
  */
trait CloseHeaderFooterCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CloseHeaderFooterCommand command.
    */
  def execute(): Boolean
}

object CloseHeaderFooterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CloseHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CloseHeaderFooterCommand]
  }
}

