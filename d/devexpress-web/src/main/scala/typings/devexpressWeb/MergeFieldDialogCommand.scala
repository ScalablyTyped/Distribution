package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Merge Field dialog.
  */
trait MergeFieldDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MergeFieldDialogCommand command.
    */
  def execute(): Boolean
}
object MergeFieldDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): MergeFieldDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MergeFieldDialogCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeFieldDialogCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
