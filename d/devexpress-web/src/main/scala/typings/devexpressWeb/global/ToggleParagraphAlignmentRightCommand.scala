package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle right paragraph alignment on and off.
  */
@JSGlobal("ToggleParagraphAlignmentRightCommand")
@js.native
class ToggleParagraphAlignmentRightCommand ()
  extends typings.devexpressWeb.ToggleParagraphAlignmentRightCommand {
  /**
    * Executes the ToggleParagraphAlignmentRightCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

