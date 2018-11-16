package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to toggle the fullscreen mode.
 */
@js.native
trait SetFullscreenCommand extends CommandWithBooleanStateBase {
  /**
       * Executes the SetFullscreenCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       */
  def execute(): scala.Boolean = js.native
  /**
       * Executes the SetFullscreenCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param fullscreen true to apply the fullscreen mode, false to disable the fullscreen mode.
       */
  def execute(fullscreen: scala.Boolean): scala.Boolean = js.native
}

