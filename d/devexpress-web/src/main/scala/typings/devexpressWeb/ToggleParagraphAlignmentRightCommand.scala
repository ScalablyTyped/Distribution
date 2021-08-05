package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle right paragraph alignment on and off.
  */
trait ToggleParagraphAlignmentRightCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleParagraphAlignmentRightCommand command.
    */
  def execute(): Boolean
}
object ToggleParagraphAlignmentRightCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentRightCommand]
  }
  
  extension [Self <: ToggleParagraphAlignmentRightCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
