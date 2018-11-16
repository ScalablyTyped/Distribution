package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to start the mail merge process and download the resulting document containing the merged information.
 */
@js.native
trait MailMergeAndDownloadCommand extends CommandBase {
  /**
       * Executes the MailMergeAndDownloadCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param documentFormat One of the DocumentFormat enumeration values.
       */
  def execute(documentFormat: js.Any): scala.Boolean = js.native
  /**
       * Executes the MailMergeAndDownloadCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param documentFormat One of the DocumentFormat enumeration values.
       * @param settings A MailMergeSettings object specifying the mail merge settings.
       */
  def execute(documentFormat: js.Any, settings: MailMergeSettings): scala.Boolean = js.native
  /**
       * Executes the MailMergeAndDownloadCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param fileExtension A string value specifying the file extension of the resulting document.
       */
  def execute(fileExtension: java.lang.String): scala.Boolean = js.native
  /**
       * Executes the MailMergeAndDownloadCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param fileExtension A string value specifying the file extension of the resulting document.
       * @param settings A MailMergeSettings object containing settings to set up mail merge operations.
       */
  def execute(fileExtension: java.lang.String, settings: MailMergeSettings): scala.Boolean = js.native
  /**
       * Gets information about the command state.
       */
  def getState(): js.Any = js.native
}

