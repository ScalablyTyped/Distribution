package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert the line break at the current position in the document.
  */
@JSGlobal("InsertLineBreakCommand")
@js.native
class InsertLineBreakCommand ()
  extends typings.devexpressWeb.InsertLineBreakCommand {
  /**
    * Executes the InsertLineBreakCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

