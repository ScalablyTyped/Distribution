package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to copy the selected text and place it to the specified position.
  */
trait CopyContentCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CopyContentCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param position An integer value specifying a position of the inserted text.
    */
  def execute(position: scala.Double): scala.Boolean
}

