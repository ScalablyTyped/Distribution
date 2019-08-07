package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the bold formatting of characters in a selected range.
  */
@JSGlobal("ChangeFontBoldCommand")
@js.native
class ChangeFontBoldCommand () extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeFontBoldCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontBold true to apply bold formatting to the text, false to remove bold formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontBold: Boolean): Boolean = js.native
}

