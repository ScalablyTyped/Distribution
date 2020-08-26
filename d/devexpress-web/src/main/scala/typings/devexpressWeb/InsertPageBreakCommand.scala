package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a page break at the current position in the document.
  */
@js.native
trait InsertPageBreakCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertPageBreakCommand command.
    */
  def execute(): Boolean = js.native
}

object InsertPageBreakCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertPageBreakCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertPageBreakCommand]
  }
  @scala.inline
  implicit class InsertPageBreakCommandOps[Self <: InsertPageBreakCommand] (val x: Self) extends AnyVal {
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

