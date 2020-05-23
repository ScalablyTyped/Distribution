package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to lock a floating object's aspect ratio.
  */
@JSGlobal("ChangeFloatingObjectLockAspectRatioCommand")
@js.native
class ChangeFloatingObjectLockAspectRatioCommand ()
  extends typings.devexpressWeb.ChangeFloatingObjectLockAspectRatioCommand {
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: Boolean): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

