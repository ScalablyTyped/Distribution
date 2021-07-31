package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a NUMPAGES field displaying the total number of pages.
  */
trait CreatePageCountFieldCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the CreatePageCountFieldCommand command.
    */
  def execute(): Boolean
}
object CreatePageCountFieldCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CreatePageCountFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CreatePageCountFieldCommand]
  }
  
  @scala.inline
  implicit class CreatePageCountFieldCommandMutableBuilder[Self <: CreatePageCountFieldCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
