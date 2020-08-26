package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the Rich Edit's document view type.
  */
@js.native
trait ChangeViewTypeCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeViewTypeCommand command with the specified parameter. A Boolean value identifying whether method execution was successful or failed.
    * @param viewType A string value specifying the Rich Edit's document view type.
    */
  def execute(viewType: ViewType): Boolean = js.native
}

object ChangeViewTypeCommand {
  @scala.inline
  def apply(execute: ViewType => Boolean, getState: () => CommandState[Boolean]): ChangeViewTypeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeViewTypeCommand]
  }
  @scala.inline
  implicit class ChangeViewTypeCommandOps[Self <: ChangeViewTypeCommand] (val x: Self) extends AnyVal {
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
    def setExecute(value: ViewType => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
  }
  
}

