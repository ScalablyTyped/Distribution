package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to add a non-breaking space in place of a selected range.
  */
@js.native
trait InsertNonBreakingSpaceCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertNonBreakingSpaceCommand command.
    */
  def execute(): Boolean = js.native
}

object InsertNonBreakingSpaceCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertNonBreakingSpaceCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertNonBreakingSpaceCommand]
  }
  @scala.inline
  implicit class InsertNonBreakingSpaceCommandOps[Self <: InsertNonBreakingSpaceCommand] (val x: Self) extends AnyVal {
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

