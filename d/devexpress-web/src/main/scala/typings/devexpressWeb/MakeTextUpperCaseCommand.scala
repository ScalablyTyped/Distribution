package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to convert the selected text to upper case.
  */
trait MakeTextUpperCaseCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MakeTextUpperCaseCommand command.
    */
  def execute(): Boolean
}
object MakeTextUpperCaseCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): MakeTextUpperCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MakeTextUpperCaseCommand]
  }
  
  extension [Self <: MakeTextUpperCaseCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
