package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle centered paragraph alignment on and off.
  */
@js.native
trait ToggleParagraphAlignmentCenterCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleParagraphAlignmentCenterCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleParagraphAlignmentCenterCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentCenterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentCenterCommand]
  }
  
  @scala.inline
  implicit class ToggleParagraphAlignmentCenterCommandMutableBuilder[Self <: ToggleParagraphAlignmentCenterCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
