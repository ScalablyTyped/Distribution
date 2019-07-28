package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to cancel changes caused by the previous command.
  */
trait UndoCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the UndoCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean
}

object UndoCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): UndoCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[UndoCommand]
  }
}

