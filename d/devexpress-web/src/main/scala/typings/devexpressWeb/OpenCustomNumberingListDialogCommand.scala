package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Customize Numbered List dialog.
  */
@js.native
trait OpenCustomNumberingListDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenCustomNumberingListDialogCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param abstractNumberingListIndex An integer value specifying index of abstract numbering list.
    */
  def execute(abstractNumberingListIndex: Double): Boolean = js.native
}

object OpenCustomNumberingListDialogCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => SimpleCommandState): OpenCustomNumberingListDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenCustomNumberingListDialogCommand]
  }
  @scala.inline
  implicit class OpenCustomNumberingListDialogCommandOps[Self <: OpenCustomNumberingListDialogCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecute(value: Double => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
  }
  
}

