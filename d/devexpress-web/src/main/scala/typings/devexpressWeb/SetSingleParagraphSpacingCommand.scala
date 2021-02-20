package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to format a current paragraph with single line spacing.
  */
@js.native
trait SetSingleParagraphSpacingCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the SetSingleParagraphSpacingCommand command.
    */
  def execute(): Boolean = js.native
}
object SetSingleParagraphSpacingCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): SetSingleParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetSingleParagraphSpacingCommand]
  }
  
  @scala.inline
  implicit class SetSingleParagraphSpacingCommandMutableBuilder[Self <: SetSingleParagraphSpacingCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
