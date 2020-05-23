package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to restart the numbering list.
  */
trait RestartNumberingListCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the RestartNumberingListCommand command.
    */
  def execute(): Boolean
}

object RestartNumberingListCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RestartNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RestartNumberingListCommand]
  }
}

