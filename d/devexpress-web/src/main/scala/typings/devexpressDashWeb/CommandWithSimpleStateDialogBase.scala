package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for dialog-related commands with a simple common command state.
  */
@JSGlobal("CommandWithSimpleStateDialogBase")
@js.native
abstract class CommandWithSimpleStateDialogBase () extends js.Object {
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}

