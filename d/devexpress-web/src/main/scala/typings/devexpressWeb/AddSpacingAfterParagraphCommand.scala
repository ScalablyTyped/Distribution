package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add spacing after a paragraph.
  */
trait AddSpacingAfterParagraphCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the AddSpacingAfterParagraphCommand command.
    */
  def execute(): Boolean
}
object AddSpacingAfterParagraphCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): AddSpacingAfterParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[AddSpacingAfterParagraphCommand]
  }
  
  extension [Self <: AddSpacingAfterParagraphCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
