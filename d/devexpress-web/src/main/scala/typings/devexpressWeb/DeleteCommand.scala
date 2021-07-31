package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the text in a selected range.
  */
trait DeleteCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteCommand command.
    */
  def execute(): Boolean
}
object DeleteCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteCommand]
  }
  
  @scala.inline
  implicit class DeleteCommandMutableBuilder[Self <: DeleteCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
