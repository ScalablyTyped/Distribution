package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to search for a specific text and replace all matches in the document with the specified string.
  */
trait ReplaceAllCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ReplaceAllCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to replace.
    * @param replaceText A string value specifying the inserted text.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    */
  def execute(text: java.lang.String, replaceText: java.lang.String, matchCase: scala.Boolean): scala.Boolean
}

object ReplaceAllCommand {
  @scala.inline
  def apply(
    execute: (java.lang.String, java.lang.String, scala.Boolean) => scala.Boolean,
    getState: () => SimpleCommandState
  ): ReplaceAllCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ReplaceAllCommand]
  }
}

