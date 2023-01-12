package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to cancel changes caused by the previous command.
  */
trait UndoCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the UndoCommand command.
    */
  def execute(): Boolean
}
object UndoCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): UndoCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[UndoCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UndoCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
