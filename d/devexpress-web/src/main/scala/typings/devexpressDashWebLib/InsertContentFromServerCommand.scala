package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to insert content created on the server to the client model.
 */
@js.native
trait InsertContentFromServerCommand extends CommandBase {
  /**
       * Executes the InsertContentFromServerCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param requestId An integer value identifying the request to the server.
       */
  def execute(requestId: java.lang.String): scala.Boolean = js.native
  /**
       * Executes the InsertContentFromServerCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param requestId An integer value identifying the request to the server.
       * @param position An integer value specifying the position where to insert content to the active sub-document.
       */
  def execute(requestId: java.lang.String, position: scala.Double): scala.Boolean = js.native
  /**
       * Executes the InsertContentFromServerCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param requestId An integer value identifying the request to the server.
       * @param position An integer value specifying position where to insert content to the active sub-document.
       * @param subDocumentId An integer value identifying the target sub-document.
       */
  def execute(requestId: java.lang.String, position: scala.Double, subDocumentId: scala.Double): scala.Boolean = js.native
}

