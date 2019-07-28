package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
  */
@js.native
trait ForceSyncWithServerCommand extends CommandBase {
  /**
    * Executes the ForceSyncWithServerCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean = js.native
  /**
    * Executes the ForceSyncWithServerCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param callback A callback function that is performed when the server model is updated.
    */
  def execute(callback: js.Function): Boolean = js.native
}

