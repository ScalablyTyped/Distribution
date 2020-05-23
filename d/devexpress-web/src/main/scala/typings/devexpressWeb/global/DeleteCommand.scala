package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete the text in a selected range.
  */
@JSGlobal("DeleteCommand")
@js.native
class DeleteCommand ()
  extends typings.devexpressWeb.DeleteCommand {
  /**
    * Executes the DeleteCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

