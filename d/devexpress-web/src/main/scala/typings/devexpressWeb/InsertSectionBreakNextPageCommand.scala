package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a section break and start a new section on the next page.
  */
trait InsertSectionBreakNextPageCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertSectionBreakNextPageCommand command.
    */
  def execute(): Boolean
}
object InsertSectionBreakNextPageCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertSectionBreakNextPageCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSectionBreakNextPageCommand]
  }
  
  extension [Self <: InsertSectionBreakNextPageCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
