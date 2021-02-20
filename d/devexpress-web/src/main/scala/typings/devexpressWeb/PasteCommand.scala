package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to paste the text from the clipboard over the selection.
  */
@js.native
trait PasteCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the PasteCommand command.
    */
  def execute(): Boolean = js.native
}
object PasteCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): PasteCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[PasteCommand]
  }
  
  @scala.inline
  implicit class PasteCommandMutableBuilder[Self <: PasteCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
