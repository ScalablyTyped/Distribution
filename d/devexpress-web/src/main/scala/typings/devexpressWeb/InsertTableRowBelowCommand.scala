package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a row in a table below the selected row.
  */
@js.native
trait InsertTableRowBelowCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableRowBelowCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertTableRowBelowCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableRowBelowCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableRowBelowCommand]
  }
  
  @scala.inline
  implicit class InsertTableRowBelowCommandMutableBuilder[Self <: InsertTableRowBelowCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
