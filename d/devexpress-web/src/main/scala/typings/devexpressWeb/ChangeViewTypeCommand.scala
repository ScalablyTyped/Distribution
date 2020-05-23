package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the Rich Edit's document view type.
  */
trait ChangeViewTypeCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeViewTypeCommand command with the specified parameter. A Boolean value identifying whether method execution was successful or failed.
    * @param viewType A string value specifying the Rich Edit's document view type.
    */
  def execute(viewType: ViewType): Boolean
}

object ChangeViewTypeCommand {
  @scala.inline
  def apply(execute: ViewType => Boolean, getState: () => CommandState[Boolean]): ChangeViewTypeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeViewTypeCommand]
  }
}

