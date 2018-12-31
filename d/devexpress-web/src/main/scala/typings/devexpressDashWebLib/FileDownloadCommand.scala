package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to download the document file, specifying its extension.
  */
@js.native
trait FileDownloadCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FileDownloadCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param documentFormat A DocumentFormat enumeration value.
    */
  def execute(documentFormat: js.Any): scala.Boolean = js.native
  /**
    * Executes the FileDownloadCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param fileExtension A string value specifying the extension of the downloading file.
    */
  def execute(fileExtension: java.lang.String): scala.Boolean = js.native
}

