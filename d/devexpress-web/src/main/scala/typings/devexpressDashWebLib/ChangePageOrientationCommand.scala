package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to change the page orientation.
 */

trait ChangePageOrientationCommand extends CommandBase {
  /**
       * Executes the ChangePageOrientationCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param isPortrait One of the Orientation enumeration values.
       */
  def execute(isPortrait: js.Any): scala.Boolean
  /**
       * Gets information about the command state.
       */
  def getState(): js.Any
}

