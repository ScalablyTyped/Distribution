package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to add a non-breaking space in place of a selected range.
  */
trait InsertNonBreakingSpaceCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertNonBreakingSpaceCommand command.
    */
  def execute(): Boolean
}

object InsertNonBreakingSpaceCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertNonBreakingSpaceCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertNonBreakingSpaceCommand]
  }
}

