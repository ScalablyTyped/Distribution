package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to create a table of tables.
  */
trait InsertTableOfTablesCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableOfTablesCommand command.
    */
  def execute(): Boolean
}
object InsertTableOfTablesCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfTablesCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfTablesCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertTableOfTablesCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
