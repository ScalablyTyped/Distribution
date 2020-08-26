package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the next page header or footer in the header/footer editing mode.
  */
@js.native
trait GoToNextHeaderFooterCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToNextHeaderFooterCommand command.
    */
  def execute(): Boolean = js.native
}

object GoToNextHeaderFooterCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToNextHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToNextHeaderFooterCommand]
  }
  @scala.inline
  implicit class GoToNextHeaderFooterCommandOps[Self <: GoToNextHeaderFooterCommand] (val x: Self) extends AnyVal {
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

