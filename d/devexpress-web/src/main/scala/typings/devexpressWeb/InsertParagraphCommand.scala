package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a paragraph break at the current position in the document.
  */
trait InsertParagraphCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertParagraphCommand command.
    */
  def execute(): Boolean
}
object InsertParagraphCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertParagraphCommand]
  }
  
  extension [Self <: InsertParagraphCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
