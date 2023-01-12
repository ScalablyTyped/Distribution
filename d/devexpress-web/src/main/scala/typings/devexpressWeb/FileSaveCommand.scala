package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to save the document to a file.
  */
trait FileSaveCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the FileSaveCommand command.
    */
  def execute(): Boolean
}
object FileSaveCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileSaveCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileSaveCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSaveCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
