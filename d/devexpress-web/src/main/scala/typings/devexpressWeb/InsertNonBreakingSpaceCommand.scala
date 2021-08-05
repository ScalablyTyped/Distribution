package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add a non-breaking space in place of a selected range.
  */
trait InsertNonBreakingSpaceCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertNonBreakingSpaceCommand command.
    */
  def execute(): Boolean
}
object InsertNonBreakingSpaceCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertNonBreakingSpaceCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertNonBreakingSpaceCommand]
  }
  
  extension [Self <: InsertNonBreakingSpaceCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
