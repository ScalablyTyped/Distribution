package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a paragraph break at the current position in the document.
  */
@JSGlobal("InsertParagraphCommand")
@js.native
class InsertParagraphCommand ()
  extends typings.devexpressWeb.InsertParagraphCommand {
  /**
    * Executes the InsertParagraphCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

