package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle left paragraph alignment on and off.
  */
@JSGlobal("ToggleParagraphAlignmentLeftCommand")
@js.native
class ToggleParagraphAlignmentLeftCommand ()
  extends typings.devexpressWeb.ToggleParagraphAlignmentLeftCommand {
  /**
    * Executes the ToggleParagraphAlignmentLeftCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

