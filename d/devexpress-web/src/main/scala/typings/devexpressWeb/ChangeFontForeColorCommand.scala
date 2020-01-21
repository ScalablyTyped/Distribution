package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font color of characters in a selected range.
  */
@JSGlobal("ChangeFontForeColorCommand")
@js.native
class ChangeFontForeColorCommand () extends CommandBase {
  /**
    * Executes the ChangeFontForeColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying the font color. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}

