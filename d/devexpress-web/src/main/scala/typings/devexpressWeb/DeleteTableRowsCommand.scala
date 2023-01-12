package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected table rows.
  */
trait DeleteTableRowsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteTableRowsCommand command.
    */
  def execute(): Boolean
}
object DeleteTableRowsCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableRowsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableRowsCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTableRowsCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
