package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
  */
@JSGlobal("FileOpenDialogCommand")
@js.native
class FileOpenDialogCommand ()
  extends typings.devexpressWeb.FileOpenDialogCommand {
  /**
    * Executes the FileOpenDialogCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

