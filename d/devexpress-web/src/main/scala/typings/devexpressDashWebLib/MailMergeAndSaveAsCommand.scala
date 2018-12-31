package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to start the mail merge process and save the resulting merged document to the server.
  */
@js.native
trait MailMergeAndSaveAsCommand extends CommandBase {
  /**
    * Executes the MailMergeAndSaveAsCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param fileInfo A RichEditFileInfo object specifying a file to save to.
    * @param settings A MailMergeSettings object specifying the mail merge settings.
    */
  def execute(fileInfo: RichEditFileInfo, settings: MailMergeSettings): scala.Boolean = js.native
  /**
    * Executes the MailMergeAndSaveAsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param filePath A string value specifying path to the saving file on the server.
    */
  def execute(filePath: java.lang.String): scala.Boolean = js.native
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any = js.native
}

