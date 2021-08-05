package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to activate the page footer and begin editing.
  */
trait InsertFooterCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertFooterCommand command.
    */
  def execute(): Boolean
}
object InsertFooterCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertFooterCommand]
  }
  
  extension [Self <: InsertFooterCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
