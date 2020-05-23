package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to open the file, specifying its path.
  */
trait FileOpenCommand extends js.Object {
  /**
    * Executes the FileOpenCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param path A string value specifying path to the opening file.
    */
  def execute(path: String): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}

object FileOpenCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): FileOpenCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileOpenCommand]
  }
}

