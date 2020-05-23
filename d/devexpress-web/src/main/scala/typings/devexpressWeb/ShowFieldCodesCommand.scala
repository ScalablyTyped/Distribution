package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to display the selected field's field codes.
  */
@js.native
trait ShowFieldCodesCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ShowFieldCodesCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param showFieldCodes true to display field codes, false to hide field codes.
    */
  def execute(): Boolean = js.native
  def execute(showFieldCodes: Boolean): Boolean = js.native
}

