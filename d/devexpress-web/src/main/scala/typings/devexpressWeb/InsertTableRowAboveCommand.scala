package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a row in a table above the selected row.
  */
@js.native
trait InsertTableRowAboveCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableRowAboveCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertTableRowAboveCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableRowAboveCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableRowAboveCommand]
  }
  
  @scala.inline
  implicit class InsertTableRowAboveCommandMutableBuilder[Self <: InsertTableRowAboveCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
