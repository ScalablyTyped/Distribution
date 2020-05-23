package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke a browser-specific Print dialog allowing one to print the current document.
  */
@JSGlobal("FilePrintCommand")
@js.native
class FilePrintCommand ()
  extends typings.devexpressWeb.FilePrintCommand {
  /**
    * Executes the FilePrintCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

