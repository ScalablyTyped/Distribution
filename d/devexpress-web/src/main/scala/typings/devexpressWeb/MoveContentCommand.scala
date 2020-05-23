package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to move the selected range to a specific position in the document.
  */
trait MoveContentCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the MoveContentCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param position An integer value specifying position to insert selected text.
    */
  def execute(position: Double): Boolean
}

object MoveContentCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => SimpleCommandState): MoveContentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MoveContentCommand]
  }
}

