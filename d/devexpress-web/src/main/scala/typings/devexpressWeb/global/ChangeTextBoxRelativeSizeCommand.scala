package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a text box' relative size settings.
  */
@JSGlobal("ChangeTextBoxRelativeSizeCommand")
@js.native
class ChangeTextBoxRelativeSizeCommand ()
  extends typings.devexpressWeb.ChangeTextBoxRelativeSizeCommand {
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.TextBoxRelativeSizeSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.TextBoxRelativeSizeSettings] = js.native
}

