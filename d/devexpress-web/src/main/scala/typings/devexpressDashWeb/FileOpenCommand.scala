package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to open the file, specifying its path.
  */
trait FileOpenCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FileOpenCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param path A string value specifying path to the opening file.
    */
  def execute(path: String): Boolean
}

object FileOpenCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): FileOpenCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[FileOpenCommand]
  }
}

