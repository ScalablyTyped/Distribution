package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets a command to invoke the Export Range dialog to start a mail merge.
  */
trait MailMergeDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MailMergeDialogCommand command.
    */
  def execute(): Boolean
}
object MailMergeDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): MailMergeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MailMergeDialogCommand]
  }
  
  extension [Self <: MailMergeDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
