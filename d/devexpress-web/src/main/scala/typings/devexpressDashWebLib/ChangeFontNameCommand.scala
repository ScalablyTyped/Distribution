package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font name of characters in a selected range.
  */
trait ChangeFontNameCommand extends CommandBase {
  /**
    * Executes the ChangeFontNameCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param fontName A string specifying the font name.
    */
  def execute(fontName: java.lang.String): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFontNameCommand {
  @scala.inline
  def apply(execute: js.Function1[java.lang.String, scala.Boolean], getState: js.Function0[js.Any]): ChangeFontNameCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[ChangeFontNameCommand]
  }
}

