package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to reverse actions of the previous undo command.
  */
@JSGlobal("RedoCommand")
@js.native
class RedoCommand ()
  extends typings.devexpressWeb.RedoCommand {
  /**
    * Executes the RedoCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

