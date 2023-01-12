package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to paste the text from the clipboard over the selection.
  */
trait PasteCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the PasteCommand command.
    */
  def execute(): Boolean
}
object PasteCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): PasteCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[PasteCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasteCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
