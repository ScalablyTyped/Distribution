package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the display of grid lines for a table with no borders applied - on/off.
  */
@JSGlobal("ShowTableGridLinesCommand")
@js.native
class ShowTableGridLinesCommand () extends CommandWithBooleanStateBase {
  /**
    * Executes the ShowTableGridLinesCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param showTableGridLines true to display table grid lines, false to hide table grid lines.
    */
  def execute(): Boolean = js.native
  def execute(showTableGridLines: Boolean): Boolean = js.native
}

