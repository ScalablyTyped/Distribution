package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to format a current paragraph with double line spacing.
  */
trait SetDoubleParagraphSpacingCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the SetDoubleParagraphSpacingCommand command.
    */
  def execute(): Boolean
}
object SetDoubleParagraphSpacingCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): SetDoubleParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetDoubleParagraphSpacingCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDoubleParagraphSpacingCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
