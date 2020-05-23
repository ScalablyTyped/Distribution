package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's text wrapping settings.
  */
@JSGlobal("ChangeFloatingObjectTextWrappingCommand")
@js.native
class ChangeFloatingObjectTextWrappingCommand ()
  extends typings.devexpressWeb.ChangeFloatingObjectTextWrappingCommand {
  /**
    * Executes the ChangeFloatingObjectTextWrappingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A FloatingObjectTextWrappingSettings object specifying text wrapping settings.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.FloatingObjectTextWrappingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.FloatingObjectTextWrappingSettings] = js.native
}

