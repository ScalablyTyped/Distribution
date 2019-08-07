package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the superscript formatting of characters in a selected range.
  */
@JSGlobal("ChangeFontSuperscriptCommand")
@js.native
class ChangeFontSuperscriptCommand () extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeFontSuperscriptCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontSuperscript true to apply superscript formatting to the text, false to remove superscript formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontSuperscript: Boolean): Boolean = js.native
}

