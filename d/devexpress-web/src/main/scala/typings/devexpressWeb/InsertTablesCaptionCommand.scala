package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a caption for a table.
  */
trait InsertTablesCaptionCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTablesCaptionCommand command.
    */
  def execute(): Boolean
}
object InsertTablesCaptionCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTablesCaptionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTablesCaptionCommand]
  }
  
  extension [Self <: InsertTablesCaptionCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
