package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert content created on the server to the client model.
  */
@JSGlobal("InsertContentFromServerCommand")
@js.native
class InsertContentFromServerCommand () extends CommandBase {
  /**
    * Executes the InsertContentFromServerCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param requestId An integer value identifying the request to the server.
    * @param position An integer value specifying position where to insert content to the active sub-document.
    * @param subDocumentId An integer value identifying the target sub-document.
    */
  def execute(requestId: String): Boolean = js.native
  def execute(requestId: String, position: Double): Boolean = js.native
  def execute(requestId: String, position: Double, subDocumentId: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}

