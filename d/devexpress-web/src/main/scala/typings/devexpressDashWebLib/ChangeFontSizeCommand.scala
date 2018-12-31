package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font size of characters in a selected range.
  */
trait ChangeFontSizeCommand extends CommandBase {
  /**
    * Executes the ChangeFontSizeCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param fontSize An integer number specifying the font size in points.
    */
  def execute(fontSize: scala.Double): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

