package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to add an HTML formatted content in place of a selected range.
  */
@JSGlobal("InsertHtmlCommand")
@js.native
class InsertHtmlCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertHtmlCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param html A string that specifies the inserted HTML code.
    */
  def execute(html: String): Boolean = js.native
}

