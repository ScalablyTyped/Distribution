package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete a specific bookmark.
  */
trait DeleteBookmarkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteBookmarkCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param name A string value specifying a name of the deleted bookmark.
    */
  def execute(name: String): Boolean
}

object DeleteBookmarkCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): DeleteBookmarkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[DeleteBookmarkCommand]
  }
}

