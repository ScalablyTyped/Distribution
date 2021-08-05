package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a section break and start a new section on the next even-numbered page.
  */
trait InsertSectionBreakEvenPageCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertSectionBreakEvenPageCommand command.
    */
  def execute(): Boolean
}
object InsertSectionBreakEvenPageCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertSectionBreakEvenPageCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSectionBreakEvenPageCommand]
  }
  
  extension [Self <: InsertSectionBreakEvenPageCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
