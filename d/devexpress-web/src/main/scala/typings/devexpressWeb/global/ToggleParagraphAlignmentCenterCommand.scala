package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle centered paragraph alignment on and off.
  */
@JSGlobal("ToggleParagraphAlignmentCenterCommand")
@js.native
class ToggleParagraphAlignmentCenterCommand ()
  extends typings.devexpressWeb.ToggleParagraphAlignmentCenterCommand {
  /**
    * Executes the ToggleParagraphAlignmentCenterCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

