package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle centered paragraph alignment on and off.
  */
trait ToggleParagraphAlignmentCenterCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleParagraphAlignmentCenterCommand command.
    */
  def execute(): Boolean
}
object ToggleParagraphAlignmentCenterCommand {
  
  inline def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentCenterCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToggleParagraphAlignmentCenterCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
