package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Font dialog allowing end-users to change the font, size and style of the selected text.
  */
trait OpenFontFormattingDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenFontFormattingDialogCommand command.
    */
  def execute(): Boolean
}
object OpenFontFormattingDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenFontFormattingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenFontFormattingDialogCommand]
  }
  
  @scala.inline
  implicit class OpenFontFormattingDialogCommandMutableBuilder[Self <: OpenFontFormattingDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
