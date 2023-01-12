package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
  */
trait FileOpenDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the FileOpenDialogCommand command.
    */
  def execute(): Boolean
}
object FileOpenDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileOpenDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileOpenDialogCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileOpenDialogCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
