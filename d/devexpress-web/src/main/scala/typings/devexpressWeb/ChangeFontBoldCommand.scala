package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the bold formatting of characters in a selected range.
  */
@js.native
trait ChangeFontBoldCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ChangeFontBoldCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontBold true to apply bold formatting to the text, false to remove bold formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontBold: Boolean): Boolean = js.native
}
