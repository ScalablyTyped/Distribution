package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle justified paragraph alignment on and off.
  */
trait ToggleParagraphAlignmentJustifyCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleParagraphAlignmentJustifyCommand command.
    */
  def execute(): Boolean
}
object ToggleParagraphAlignmentJustifyCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentJustifyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentJustifyCommand]
  }
  
  extension [Self <: ToggleParagraphAlignmentJustifyCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
