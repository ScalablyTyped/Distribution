package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's relative position.
  */
@JSGlobal("ChangeFloatingObjectRelativePositionCommand")
@js.native
class ChangeFloatingObjectRelativePositionCommand ()
  extends typings.devexpressWeb.ChangeFloatingObjectRelativePositionCommand {
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.FloatingObjectRelativePositionSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.FloatingObjectRelativePositionSettings] = js.native
}

