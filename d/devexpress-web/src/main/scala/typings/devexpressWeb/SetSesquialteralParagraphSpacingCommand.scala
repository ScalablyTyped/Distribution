package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to format a current paragraph with one and a half line spacing.
  */
trait SetSesquialteralParagraphSpacingCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the SetSesquialteralParagraphSpacingCommand command.
    */
  def execute(): Boolean
}
object SetSesquialteralParagraphSpacingCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): SetSesquialteralParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetSesquialteralParagraphSpacingCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetSesquialteralParagraphSpacingCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
