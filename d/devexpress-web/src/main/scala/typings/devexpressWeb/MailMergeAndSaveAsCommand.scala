package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to start the mail merge process and save the resulting merged document to the server.
  */
@JSGlobal("MailMergeAndSaveAsCommand")
@js.native
class MailMergeAndSaveAsCommand () extends js.Object {
  /**
    * Executes the MailMergeAndSaveAsCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param filePath The path to a saved file, or an object that contains the saved file information.
    * @param settings An object that contains settings to set up the mail merge operation.
    */
  def execute(filePath: String): Boolean = js.native
  def execute(filePath: String, settings: MailMergeSettings): Boolean = js.native
  def execute(filePath: RichEditFileInfo): Boolean = js.native
  def execute(filePath: RichEditFileInfo, settings: MailMergeSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[MailMergeSettings] = js.native
}

