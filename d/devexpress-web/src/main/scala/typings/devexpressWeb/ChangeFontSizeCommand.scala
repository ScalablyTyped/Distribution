package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font size of characters in a selected range.
  */
@JSGlobal("ChangeFontSizeCommand")
@js.native
class ChangeFontSizeCommand () extends CommandBase {
  /**
    * Executes the ChangeFontSizeCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontSize An integer number specifying the font size in points.
    */
  def execute(fontSize: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double] = js.native
}

