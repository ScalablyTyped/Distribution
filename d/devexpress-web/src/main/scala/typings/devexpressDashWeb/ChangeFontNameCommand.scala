package typings.devexpressDashWeb

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
  def execute(fontName: String): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFontNameCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => js.Any): ChangeFontNameCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFontNameCommand]
  }
}

