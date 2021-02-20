package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to create a table of equations.
  */
@js.native
trait InsertTableOfEquationsCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableOfEquationsCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertTableOfEquationsCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfEquationsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfEquationsCommand]
  }
  
  @scala.inline
  implicit class InsertTableOfEquationsCommandMutableBuilder[Self <: InsertTableOfEquationsCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
