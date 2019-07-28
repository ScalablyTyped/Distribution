package typings.devexpressDashWeb

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
  def execute(abstractNumberingListIndex: Double): Boolean
}

object OpenCustomNumberingListDialogCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => SimpleCommandState): OpenCustomNumberingListDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[OpenCustomNumberingListDialogCommand]
  }
}

