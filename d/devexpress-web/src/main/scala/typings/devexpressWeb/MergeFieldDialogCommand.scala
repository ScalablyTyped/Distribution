package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Merge Field dialog.
  */
@js.native
trait MergeFieldDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the MergeFieldDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object MergeFieldDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MergeFieldDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MergeFieldDialogCommand]
  }
  
  @scala.inline
  implicit class MergeFieldDialogCommandMutableBuilder[Self <: MergeFieldDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
