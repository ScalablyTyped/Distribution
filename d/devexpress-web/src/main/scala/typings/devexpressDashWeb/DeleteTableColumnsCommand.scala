package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete the selected table columns.
  */
trait DeleteTableColumnsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteTableColumnsCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean
}

object DeleteTableColumnsCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableColumnsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[DeleteTableColumnsCommand]
  }
}

