package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to cancel changes caused by the previous command.
  */
@JSGlobal("UndoCommand")
@js.native
class UndoCommand ()
  extends typings.devexpressWeb.UndoCommand {
  /**
    * Executes the UndoCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

