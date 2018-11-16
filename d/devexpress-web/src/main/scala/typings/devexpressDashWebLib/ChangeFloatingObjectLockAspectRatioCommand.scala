package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to lock a floating object's aspect ratio.
 */

trait ChangeFloatingObjectLockAspectRatioCommand extends CommandBase {
  /**
       * Executes the ChangeFloatingObjectLockAspectRatioCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param lockAspectRatio true to lock the aspect ratio and maintain the proportions; otherwise, false.
       */
  def execute(lockAspectRatio: scala.Boolean): scala.Boolean
  /**
       * Gets information about the command state.
       */
  def getState(): js.Any
}

