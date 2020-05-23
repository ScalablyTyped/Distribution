package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a character into the document.
  */
trait InsertSymbolCommand extends js.Object {
  /**
    * Executes the InsertSymbolCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param symbol A string value specifying symbols to insert.
    * @param fontName A string value specifying the font of symbols to insert.
    */
  def execute(symbol: String, fontName: String): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}

object InsertSymbolCommand {
  @scala.inline
  def apply(execute: (String, String) => Boolean, getState: () => SimpleCommandState): InsertSymbolCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSymbolCommand]
  }
}

