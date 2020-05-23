package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with the Boolean state.
  */
trait CommandWithBooleanStateBase extends CommandBase {
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}

object CommandWithBooleanStateBase {
  @scala.inline
  def apply(getState: () => CommandState[Boolean]): CommandWithBooleanStateBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CommandWithBooleanStateBase]
  }
}

