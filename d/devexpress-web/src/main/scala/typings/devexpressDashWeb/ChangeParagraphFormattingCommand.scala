package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the formatting of paragraphs in a selected range.
  */
@JSGlobal("ChangeParagraphFormattingCommand")
@js.native
class ChangeParagraphFormattingCommand () extends CommandBase {
  /**
    * Executes the ChangeParagraphFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A ParagraphFormattingSettings object specifying paragraph formatting settings.
    */
  def execute(settings: ParagraphFormattingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[ParagraphFormattingSettings] = js.native
}

