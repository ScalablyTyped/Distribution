package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to find all matches of the specified text in the document.
  */
@js.native
trait FindAllCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FindAllCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param text A string value specifying text to find.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    * @param highlightResults true, to highlight the search results; otherwise, false.
    * @param results An array of Interval objects containing the search results.
    */
  def execute(text: String, matchCase: Boolean, highlightResults: Boolean): Boolean = js.native
  def execute(text: String, matchCase: Boolean, highlightResults: Boolean, results: js.Array[Interval]): Boolean = js.native
}

