package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the display of grid lines for a table with no borders applied - on/off.
  */
@js.native
trait ShowTableGridLinesCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ShowTableGridLinesCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean = js.native
  /**
    * Executes the ShowTableGridLinesCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param showTableGridLines true to display grid lines of the table, false to hide grid lines of the table.
    */
  def execute(showTableGridLines: Boolean): Boolean = js.native
}

