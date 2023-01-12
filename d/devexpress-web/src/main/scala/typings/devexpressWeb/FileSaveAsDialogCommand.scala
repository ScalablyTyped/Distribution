package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to open the file's Save As dialog.
  */
trait FileSaveAsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the FileSaveAsDialogCommand command.
    */
  def execute(): Boolean
}
object FileSaveAsDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileSaveAsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileSaveAsDialogCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSaveAsDialogCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
