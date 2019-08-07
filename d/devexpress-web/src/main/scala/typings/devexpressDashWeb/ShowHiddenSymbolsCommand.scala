package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the visibility of hidden symbols.
  */
@JSGlobal("ShowHiddenSymbolsCommand")
@js.native
class ShowHiddenSymbolsCommand () extends CommandWithBooleanStateBase {
  /**
    * Executes the ShowHiddenSymbolsCommand command. true if the command has been successfully executed; false if the command execution has failed.
    * @param show true, to show hidden symbols; otherwise, false.
    */
  def execute(): Boolean = js.native
  def execute(show: Boolean): Boolean = js.native
}

