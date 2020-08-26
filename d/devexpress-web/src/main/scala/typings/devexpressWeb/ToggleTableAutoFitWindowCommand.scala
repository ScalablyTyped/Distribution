package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to fit the specified table to a document's window.
  */
@js.native
trait ToggleTableAutoFitWindowCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ToggleTableAutoFitWindowCommand command.
    */
  def execute(): Boolean = js.native
}

object ToggleTableAutoFitWindowCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTableAutoFitWindowCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableAutoFitWindowCommand]
  }
  @scala.inline
  implicit class ToggleTableAutoFitWindowCommandOps[Self <: ToggleTableAutoFitWindowCommand] (val x: Self) extends AnyVal {
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

