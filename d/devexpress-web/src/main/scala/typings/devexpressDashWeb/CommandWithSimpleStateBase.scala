package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with a simple common command state.
  */
trait CommandWithSimpleStateBase extends CommandBase {
  /**
    * Gets information about the command state.
    */
  def getState(): SimpleCommandState
}

object CommandWithSimpleStateBase {
  @scala.inline
  def apply(getState: () => SimpleCommandState): CommandWithSimpleStateBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[CommandWithSimpleStateBase]
  }
}

