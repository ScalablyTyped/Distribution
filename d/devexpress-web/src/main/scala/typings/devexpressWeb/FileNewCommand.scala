package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to create a new empty document.
  */
trait FileNewCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the FileNewCommand command.
    */
  def execute(): Boolean
}
object FileNewCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileNewCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileNewCommand]
  }
  
  extension [Self <: FileNewCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
