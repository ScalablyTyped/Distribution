package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a character into the document.
  */
trait InsertSymbolCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertSymbolCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param symbol A string value specifying symbols to insert.
    * @param fontName A string value specifying the font of symbols to insert.
    */
  def execute(symbol: java.lang.String, fontName: java.lang.String): scala.Boolean
}

object InsertSymbolCommand {
  @scala.inline
  def apply(execute: (java.lang.String, java.lang.String) => scala.Boolean, getState: () => SimpleCommandState): InsertSymbolCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[InsertSymbolCommand]
  }
}

