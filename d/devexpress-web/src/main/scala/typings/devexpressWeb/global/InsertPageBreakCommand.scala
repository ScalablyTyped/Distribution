package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a page break at the current position in the document.
  */
@JSGlobal("InsertPageBreakCommand")
@js.native
class InsertPageBreakCommand ()
  extends typings.devexpressWeb.InsertPageBreakCommand {
  /**
    * Executes the InsertPageBreakCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

