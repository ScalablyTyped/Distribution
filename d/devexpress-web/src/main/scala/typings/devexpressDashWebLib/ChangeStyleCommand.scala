package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected range's style.
  */
@js.native
trait ChangeStyleCommand extends CommandBase {
  /**
    * Executes the ChangeStyleCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param styleName A string specifying the applying style's name.
    * @param isParagraphStyle true to apply the style to a paragraph, false to apply the style to a character.
    */
  def execute(styleName: java.lang.String, isParagraphStyle: scala.Boolean): scala.Boolean = js.native
  /**
    * Executes the ChangeStyleCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param style A StyleBase object specifying the selected range's style.
    */
  def execute(style: StyleBase): scala.Boolean = js.native
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any = js.native
}

