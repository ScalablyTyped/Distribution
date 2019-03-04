package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font color of characters in a selected range.
  */
trait ChangeFontForeColorCommand extends CommandBase {
  /**
    * Executes the ChangeFontForeColorCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param color A string specifying the font color. May be specified as a color name or a hex color value.
    */
  def execute(color: java.lang.String): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFontForeColorCommand {
  @scala.inline
  def apply(execute: js.Function1[java.lang.String, scala.Boolean], getState: js.Function0[js.Any]): ChangeFontForeColorCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[ChangeFontForeColorCommand]
  }
}

