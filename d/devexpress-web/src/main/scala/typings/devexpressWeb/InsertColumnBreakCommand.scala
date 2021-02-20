package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a column break at the current position in the document.
  */
@js.native
trait InsertColumnBreakCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertColumnBreakCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertColumnBreakCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertColumnBreakCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertColumnBreakCommand]
  }
  
  @scala.inline
  implicit class InsertColumnBreakCommandMutableBuilder[Self <: InsertColumnBreakCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
