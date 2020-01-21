package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Save As dialog that prompts for a file name and saves the current document in a file with the specified path.
  */
@JSGlobal("FileSaveAsCommand")
@js.native
class FileSaveAsCommand () extends js.Object {
  /**
    * Executes the FileSaveAsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    */
  def execute(path: String): Boolean = js.native
  def execute(path: RichEditFileInfo): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}

