package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to search for a specific text and replace the next match in the document with the specified string.
  */
@JSGlobal("ReplaceNextCommand")
@js.native
class ReplaceNextCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the ReplaceNextCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param text A string value specifying a text to replace.
    * @param replaceText A string value specifying the inserted text.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    */
  def execute(text: String, replaceText: String, matchCase: Boolean): Boolean = js.native
}

