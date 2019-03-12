package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the background color of paragraphs in a selected range.
  */
trait ChangeParagraphBackColorCommand extends CommandBase {
  /**
    * Executes the ChangeParagraphBackColorCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param color A string specifying a background color of the paragraphs in a selected range. May be specified as a color name or a hex color value.
    */
  def execute(color: java.lang.String): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeParagraphBackColorCommand {
  @scala.inline
  def apply(execute: java.lang.String => scala.Boolean, getState: () => js.Any): ChangeParagraphBackColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeParagraphBackColorCommand]
  }
}

