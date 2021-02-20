package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle justified paragraph alignment on and off.
  */
@js.native
trait ToggleParagraphAlignmentJustifyCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleParagraphAlignmentJustifyCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleParagraphAlignmentJustifyCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentJustifyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentJustifyCommand]
  }
  
  @scala.inline
  implicit class ToggleParagraphAlignmentJustifyCommandMutableBuilder[Self <: ToggleParagraphAlignmentJustifyCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
