package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the background color of paragraphs in a selected range.
  */
@JSGlobal("ChangeParagraphBackColorCommand")
@js.native
class ChangeParagraphBackColorCommand () extends CommandBase {
  /**
    * Executes the ChangeParagraphBackColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying a background color of the paragraphs in a selected range. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}

