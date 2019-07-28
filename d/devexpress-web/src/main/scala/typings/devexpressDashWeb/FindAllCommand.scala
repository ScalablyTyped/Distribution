package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to find all matches of the specified text in the document.
  */
@js.native
trait FindAllCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FindAllCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying finding text.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    * @param highlightResults true, to highlight the search results; otherwise, false.
    */
  def execute(text: String, matchCase: Boolean, highlightResults: Boolean): Boolean = js.native
  /**
    * Executes the FindAllCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying text to find.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    * @param highlightResults true, to highlight the search results; otherwise, false.
    * @param results An array of Interval objects containing the search results.
    */
  def execute(text: String, matchCase: Boolean, highlightResults: Boolean, results: js.Array[Interval]): Boolean = js.native
}

