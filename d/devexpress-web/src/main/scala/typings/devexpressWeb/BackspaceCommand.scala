package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to move the cursor backwards and erase the character in that space.
  */
trait BackspaceCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the BackspaceCommand command.
    */
  def execute(): Boolean
}
object BackspaceCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): BackspaceCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[BackspaceCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackspaceCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
