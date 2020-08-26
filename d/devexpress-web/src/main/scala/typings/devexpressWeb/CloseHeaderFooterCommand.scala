package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to finish header/footer editing.
  */
@js.native
trait CloseHeaderFooterCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CloseHeaderFooterCommand command.
    */
  def execute(): Boolean = js.native
}

object CloseHeaderFooterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CloseHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CloseHeaderFooterCommand]
  }
  @scala.inline
  implicit class CloseHeaderFooterCommandOps[Self <: CloseHeaderFooterCommand] (val x: Self) extends AnyVal {
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
    def setExecute(value: () => Boolean): Self = this.set("execute", js.Any.fromFunction0(value))
  }
  
}

