package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to disable automatic adjusting of the selected table.
  */
@js.native
trait ToggleTableFixedColumnWidthCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the ToggleTableFixedColumnWidthCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableFixedColumnWidthCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTableFixedColumnWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableFixedColumnWidthCommand]
  }
  
  @scala.inline
  implicit class ToggleTableFixedColumnWidthCommandMutableBuilder[Self <: ToggleTableFixedColumnWidthCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
