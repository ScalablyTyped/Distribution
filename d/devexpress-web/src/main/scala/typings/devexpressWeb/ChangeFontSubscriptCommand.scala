package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the subscript formatting of characters in the selected range.
  */
@js.native
trait ChangeFontSubscriptCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ChangeFontSubscriptCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontSubscript true to apply subscript formatting to the text, false to remove subscript formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontSubscript: Boolean): Boolean = js.native
}
