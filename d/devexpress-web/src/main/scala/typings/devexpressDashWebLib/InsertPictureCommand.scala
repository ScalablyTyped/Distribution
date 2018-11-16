package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to insert a picture from a file.
 */

trait InsertPictureCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the InsertPictureCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param imageUrl A string value specifying picture's Url.
       */
  def execute(imageUrl: java.lang.String): scala.Boolean
}

