package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to add an HTML formatted content in place of a selected range.
  */
@JSGlobal("InsertHtmlCommand")
@js.native
class InsertHtmlCommand ()
  extends typings.devexpressWeb.InsertHtmlCommand {
  /**
    * Executes the InsertHtmlCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param html A string that specifies the inserted HTML code.
    */
  /* CompleteClass */
  override def execute(html: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

