package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to create a table of figures.
  */
trait InsertTableOfFiguresCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableOfFiguresCommand command.
    */
  def execute(): Boolean
}
object InsertTableOfFiguresCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfFiguresCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfFiguresCommand]
  }
  
  extension [Self <: InsertTableOfFiguresCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
