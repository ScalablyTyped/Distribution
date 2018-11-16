package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to open the file, specifying its path.
 */

trait FileOpenCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the FileOpenCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param path A string value specifying path to the opening file.
       */
  def execute(path: java.lang.String): scala.Boolean
}

