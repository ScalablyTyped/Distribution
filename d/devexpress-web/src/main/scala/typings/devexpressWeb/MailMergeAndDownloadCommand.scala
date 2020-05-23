package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to start the mail merge process and download the resulting document containing the merged information.
  */
@js.native
trait MailMergeAndDownloadCommand extends js.Object {
  /**
    * Executes the MailMergeAndDownloadCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param fileExtension A string value specifying the file extension of the resulting document.
    * @param settings A MailMergeSettings object containing settings to set up mail merge operations.
    */
  def execute(fileExtension: String): Boolean = js.native
  def execute(fileExtension: String, settings: MailMergeSettings): Boolean = js.native
  def execute(fileExtension: DocumentFormat): Boolean = js.native
  def execute(fileExtension: DocumentFormat, settings: MailMergeSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[MailMergeSettings] = js.native
}

