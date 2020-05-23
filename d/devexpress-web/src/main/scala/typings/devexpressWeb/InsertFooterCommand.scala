package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to activate the page footer and begin editing.
  */
trait InsertFooterCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertFooterCommand command.
    */
  def execute(): Boolean
}

object InsertFooterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertFooterCommand]
  }
}

