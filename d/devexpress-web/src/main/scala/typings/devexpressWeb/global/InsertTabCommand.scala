package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a tab character at the current position in the document.
  */
@JSGlobal("InsertTabCommand")
@js.native
class InsertTabCommand ()
  extends typings.devexpressWeb.InsertTabCommand {
  /**
    * Executes the InsertTabCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

