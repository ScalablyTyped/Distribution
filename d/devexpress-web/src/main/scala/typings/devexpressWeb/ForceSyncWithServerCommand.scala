package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
  */
trait ForceSyncWithServerCommand extends CommandBase {
  /**
    * Executes the ForceSyncWithServerCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param callback A callback function that is performed when the server model is updated.
    */
  def execute(callback: js.Function0[Unit]): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}

object ForceSyncWithServerCommand {
  @scala.inline
  def apply(execute: js.Function0[Unit] => Boolean, getState: () => SimpleCommandState): ForceSyncWithServerCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ForceSyncWithServerCommand]
  }
}

