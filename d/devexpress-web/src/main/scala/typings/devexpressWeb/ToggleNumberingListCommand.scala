package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the numbered paragraph and normal text.
  */
trait ToggleNumberingListCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleNumberingListCommand command.
    */
  def execute(): Boolean
}

object ToggleNumberingListCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleNumberingListCommand]
  }
}

