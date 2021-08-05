package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Spelling dialog window.
  */
trait OpenSpellingDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenSpellingDialogCommand command.
    */
  def execute(): Boolean
}
object OpenSpellingDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenSpellingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenSpellingDialogCommand]
  }
  
  extension [Self <: OpenSpellingDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
