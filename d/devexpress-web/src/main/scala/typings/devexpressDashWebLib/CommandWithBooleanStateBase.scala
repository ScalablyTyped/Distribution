package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with the Boolean state.
  */
trait CommandWithBooleanStateBase extends CommandBase {
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object CommandWithBooleanStateBase {
  @scala.inline
  def apply(getState: () => js.Any): CommandWithBooleanStateBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[CommandWithBooleanStateBase]
  }
}

