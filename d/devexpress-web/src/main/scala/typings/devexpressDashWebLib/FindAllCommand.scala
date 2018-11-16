package typings
package devexpressDashWebLib

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
  def execute(text: java.lang.String, matchCase: scala.Boolean, highlightResults: scala.Boolean): scala.Boolean = js.native
  /**
       * Executes the FindAllCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param text A string value specifying text to find.
       * @param matchCase true, to perform a case-sensitive search; otherwise, false.
       * @param highlightResults true, to highlight the search results; otherwise, false.
       * @param results An array of Interval objects containing the search results.
       */
  def execute(
    text: java.lang.String,
    matchCase: scala.Boolean,
    highlightResults: scala.Boolean,
    results: js.Array[Interval]
  ): scala.Boolean = js.native
}

