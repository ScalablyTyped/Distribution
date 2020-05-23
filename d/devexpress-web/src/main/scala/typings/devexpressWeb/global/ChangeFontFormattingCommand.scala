package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font formatting of characters in a selected range.
  */
@JSGlobal("ChangeFontFormattingCommand")
@js.native
class ChangeFontFormattingCommand ()
  extends typings.devexpressWeb.ChangeFontFormattingCommand {
  /**
    * Executes the ChangeFontFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A  FontFormattingSettings object specifying font formatting settings.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.FontFormattingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.FontFormattingSettings] = js.native
}

