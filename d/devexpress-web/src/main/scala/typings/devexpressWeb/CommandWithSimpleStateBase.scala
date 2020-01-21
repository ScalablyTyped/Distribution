package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with a simple common command state.
  */
@JSGlobal("CommandWithSimpleStateBase")
@js.native
abstract class CommandWithSimpleStateBase () extends CommandBase {
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}

