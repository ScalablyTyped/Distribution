package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to cut the selected text and place it to the clipboard.
  */
@JSGlobal("CutCommand")
@js.native
class CutCommand ()
  extends typings.devexpressWeb.CutCommand {
  /**
    * Executes the CutCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

