package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle justified paragraph alignment on and off.
  */
@JSGlobal("ToggleParagraphAlignmentJustifyCommand")
@js.native
class ToggleParagraphAlignmentJustifyCommand ()
  extends typings.devexpressWeb.ToggleParagraphAlignmentJustifyCommand {
  /**
    * Executes the ToggleParagraphAlignmentJustifyCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

