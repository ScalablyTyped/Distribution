package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change a floating object's absolute size.
  */
@JSGlobal("ChangeFloatingObjectAbsoluteSizeCommand")
@js.native
class ChangeFloatingObjectAbsoluteSizeCommand ()
  extends typings.devexpressWeb.ChangeFloatingObjectAbsoluteSizeCommand {
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.FloatingObjectAbsoluteSizeSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.FloatingObjectAbsoluteSizeSettings] = js.native
}

