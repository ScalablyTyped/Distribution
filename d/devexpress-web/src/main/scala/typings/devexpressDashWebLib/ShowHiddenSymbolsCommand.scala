package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the visibility of hidden symbols.
  */
@js.native
trait ShowHiddenSymbolsCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ShowHiddenSymbolsCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean = js.native
  /**
    * Executes the ShowHiddenSymbolsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param show true to display hidden symbols; otherwise, false.
    */
  def execute(show: scala.Boolean): scala.Boolean = js.native
}

