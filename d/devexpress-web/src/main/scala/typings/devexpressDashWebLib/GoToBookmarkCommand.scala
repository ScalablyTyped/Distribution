package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Gets a command to navigate to the specified bookmark in the document.
 */

trait GoToBookmarkCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the GoToBookmarkCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param name A string value specifying the bookmark's name
       */
  def execute(name: java.lang.String): scala.Boolean
}

