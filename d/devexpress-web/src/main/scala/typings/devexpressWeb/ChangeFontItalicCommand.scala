package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the italic formatting of characters in a selected range.
  */
@js.native
trait ChangeFontItalicCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ChangeFontItalicCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontItalic true to apply italic formatting to the text, false to remove italic formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontItalic: Boolean): Boolean = js.native
}
