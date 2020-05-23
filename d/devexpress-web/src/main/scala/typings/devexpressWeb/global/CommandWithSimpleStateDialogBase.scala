package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for dialog-related commands with a simple common command state.
  */
@JSGlobal("CommandWithSimpleStateDialogBase")
@js.native
abstract class CommandWithSimpleStateDialogBase ()
  extends typings.devexpressWeb.CommandWithSimpleStateDialogBase {
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

