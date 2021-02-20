package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a tab character at the current position in the document.
  */
@js.native
trait InsertTabCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTabCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertTabCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTabCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTabCommand]
  }
  
  @scala.inline
  implicit class InsertTabCommandMutableBuilder[Self <: InsertTabCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
