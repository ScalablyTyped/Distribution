package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to change a floating object's absolute size.
 */

trait ChangeFloatingObjectAbsoluteSizeCommand extends CommandBase {
  /**
       * Executes the ChangeFloatingObjectAbsoluteSizeCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param settings A FloatingObjectAbsoluteSizeSettings object specifying absolute size settings.
       */
  def execute(settings: FloatingObjectAbsoluteSizeSettings): scala.Boolean
  /**
       * Gets information about the command state.
       */
  def getState(): js.Any
}

