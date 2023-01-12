package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Bookmark dialog.
  */
trait OpenInsertBookmarkDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenInsertBookmarkDialogCommand command.
    */
  def execute(): Boolean
}
object OpenInsertBookmarkDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertBookmarkDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertBookmarkDialogCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenInsertBookmarkDialogCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
