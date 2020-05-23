package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to format a current paragraph with double line spacing.
  */
@JSGlobal("SetDoubleParagraphSpacingCommand")
@js.native
class SetDoubleParagraphSpacingCommand ()
  extends typings.devexpressWeb.SetDoubleParagraphSpacingCommand {
  /**
    * Executes the SetDoubleParagraphSpacingCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

