package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a column break at the current position in the document.
  */
@JSGlobal("InsertColumnBreakCommand")
@js.native
class InsertColumnBreakCommand ()
  extends typings.devexpressWeb.InsertColumnBreakCommand {
  /**
    * Executes the InsertColumnBreakCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

