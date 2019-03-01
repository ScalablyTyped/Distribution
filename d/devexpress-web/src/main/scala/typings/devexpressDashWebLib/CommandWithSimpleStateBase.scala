package typings
package devexpressDashWebLib

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
  def apply(getState: js.Function0[SimpleCommandState]): CommandWithSimpleStateBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[CommandWithSimpleStateBase]
  }
}

