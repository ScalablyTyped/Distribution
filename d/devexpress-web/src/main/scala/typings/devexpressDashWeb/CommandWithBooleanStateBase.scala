package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with the Boolean state.
  */
@JSGlobal("CommandWithBooleanStateBase")
@js.native
abstract class CommandWithBooleanStateBase () extends CommandBase {
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean] = js.native
}

