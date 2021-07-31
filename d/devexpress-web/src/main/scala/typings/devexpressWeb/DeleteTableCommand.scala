package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected table.
  */
trait DeleteTableCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteTableCommand command.
    */
  def execute(): Boolean
}
object DeleteTableCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableCommand]
  }
  
  @scala.inline
  implicit class DeleteTableCommandMutableBuilder[Self <: DeleteTableCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
