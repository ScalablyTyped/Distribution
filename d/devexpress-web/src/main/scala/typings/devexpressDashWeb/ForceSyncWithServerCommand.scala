package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
  */
@JSGlobal("ForceSyncWithServerCommand")
@js.native
class ForceSyncWithServerCommand () extends CommandBase {
  /**
    * Executes the ForceSyncWithServerCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param callback A callback function that is performed when the server model is updated.
    */
  def execute(callback: js.Function0[Unit]): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}

