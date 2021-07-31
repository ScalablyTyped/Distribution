package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a table column to the left of the current position in the table.
  */
trait InsertTableColumnToTheLeftCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableColumnToTheLeftCommand command.
    */
  def execute(): Boolean
}
object InsertTableColumnToTheLeftCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableColumnToTheLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableColumnToTheLeftCommand]
  }
  
  @scala.inline
  implicit class InsertTableColumnToTheLeftCommandMutableBuilder[Self <: InsertTableColumnToTheLeftCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
