package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to invoke the Customize Numbered List dialog.
 */

trait OpenCustomNumberingListDialogCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the OpenCustomNumberingListDialogCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param abstractNumberingListIndex An integer value specifying index of abstract numbering list.
       */
  def execute(abstractNumberingListIndex: scala.Double): scala.Boolean
}

