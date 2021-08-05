package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to decrease the font size of characters in a selected range to the closest smaller predefined value.
  */
trait DecreaseFontSizeCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DecreaseFontSizeCommand command.
    */
  def execute(): Boolean
}
object DecreaseFontSizeCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecreaseFontSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DecreaseFontSizeCommand]
  }
  
  extension [Self <: DecreaseFontSizeCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
