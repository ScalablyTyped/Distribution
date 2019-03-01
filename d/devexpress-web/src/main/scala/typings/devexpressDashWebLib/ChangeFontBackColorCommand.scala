package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the background color of characters in a selected range.
  */
trait ChangeFontBackColorCommand extends CommandBase {
  /**
    * Executes the ChangeFontBackColorCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param color A string specifying the background font color. May be specified as a color name or a hex color value.
    */
  def execute(color: java.lang.String): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFontBackColorCommand {
  @scala.inline
  def apply(execute: js.Function1[java.lang.String, scala.Boolean], getState: js.Function0[js.Any]): ChangeFontBackColorCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeFontBackColorCommand]
  }
}

