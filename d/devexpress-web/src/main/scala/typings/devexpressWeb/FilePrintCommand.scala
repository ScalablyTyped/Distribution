package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke a browser-specific Print dialog allowing one to print the current document.
  */
@js.native
trait FilePrintCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the FilePrintCommand command.
    */
  def execute(): Boolean = js.native
}
object FilePrintCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): FilePrintCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FilePrintCommand]
  }
  
  @scala.inline
  implicit class FilePrintCommandMutableBuilder[Self <: FilePrintCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
