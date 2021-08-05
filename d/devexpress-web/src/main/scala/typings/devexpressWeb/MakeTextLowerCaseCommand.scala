package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to convert the selected text to lower case.
  */
trait MakeTextLowerCaseCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MakeTextLowerCaseCommand command.
    */
  def execute(): Boolean
}
object MakeTextLowerCaseCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): MakeTextLowerCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MakeTextLowerCaseCommand]
  }
  
  extension [Self <: MakeTextLowerCaseCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
