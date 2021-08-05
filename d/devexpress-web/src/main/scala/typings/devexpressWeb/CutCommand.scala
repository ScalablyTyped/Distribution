package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to cut the selected text and place it to the clipboard.
  */
trait CutCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the CutCommand command.
    */
  def execute(): Boolean
}
object CutCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): CutCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CutCommand]
  }
  
  extension [Self <: CutCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
