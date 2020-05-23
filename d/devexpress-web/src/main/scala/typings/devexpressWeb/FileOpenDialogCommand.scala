package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
  */
trait FileOpenDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FileOpenDialogCommand command.
    */
  def execute(): Boolean
}

object FileOpenDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileOpenDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileOpenDialogCommand]
  }
}

