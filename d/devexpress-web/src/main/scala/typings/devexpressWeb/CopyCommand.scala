package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to copy the selected text and place it to the clipboard.
  */
@js.native
trait CopyCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the CopyCommand command.
    */
  def execute(): Boolean = js.native
}
object CopyCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CopyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CopyCommand]
  }
  
  @scala.inline
  implicit class CopyCommandMutableBuilder[Self <: CopyCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
