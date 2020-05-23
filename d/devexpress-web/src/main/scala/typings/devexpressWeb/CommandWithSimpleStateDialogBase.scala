package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for dialog-related commands with a simple common command state.
  */
trait CommandWithSimpleStateDialogBase extends js.Object {
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}

object CommandWithSimpleStateDialogBase {
  @scala.inline
  def apply(getState: () => SimpleCommandState): CommandWithSimpleStateDialogBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CommandWithSimpleStateDialogBase]
  }
}

