package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected table columns.
  */
trait DeleteTableColumnsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteTableColumnsCommand command.
    */
  def execute(): Boolean
}
object DeleteTableColumnsCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableColumnsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableColumnsCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTableColumnsCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
