package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Paragraph dialog allowing end-users to set paragraph formatting.
  */
trait OpenParagraphFormattingDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenParagraphFormattingDialogCommand command.
    */
  def execute(): Boolean
}
object OpenParagraphFormattingDialogCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenParagraphFormattingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenParagraphFormattingDialogCommand]
  }
  
  extension [Self <: OpenParagraphFormattingDialogCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
