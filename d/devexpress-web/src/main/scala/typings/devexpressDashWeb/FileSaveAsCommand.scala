package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Save As dialog that prompts for a file name and saves the current document in a file with the specified path.
  */
@js.native
trait FileSaveAsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FileSaveAsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param fileInfo A <see cref="Boolean" /> object specifying a file to save to.
    */
  def execute(fileInfo: RichEditFileInfo): Boolean = js.native
  /**
    * Executes the FileSaveAsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param path A string value specifying the path to the saving file. Note that the path should be relative to the work directory.
    */
  def execute(path: String): Boolean = js.native
}

