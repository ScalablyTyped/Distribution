package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert the line break at the current position in the document.
  */
@js.native
trait InsertLineBreakCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertLineBreakCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertLineBreakCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertLineBreakCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertLineBreakCommand]
  }
  
  @scala.inline
  implicit class InsertLineBreakCommandMutableBuilder[Self <: InsertLineBreakCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
