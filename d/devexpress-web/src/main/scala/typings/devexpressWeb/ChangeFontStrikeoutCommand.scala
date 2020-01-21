package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the strikeout formatting of characters in a selected range.
  */
@JSGlobal("ChangeFontStrikeoutCommand")
@js.native
class ChangeFontStrikeoutCommand () extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeFontStrikeoutCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontStrikeout true to apply strikeout formatting to the text, false to remove strikeout formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontStrikeout: Boolean): Boolean = js.native
}

