package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to update a table of contents.
  */
trait UpdateTableOfContentsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the UpdateTableOfContentsCommand command.
    */
  def execute(): Boolean
}
object UpdateTableOfContentsCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): UpdateTableOfContentsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[UpdateTableOfContentsCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTableOfContentsCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
