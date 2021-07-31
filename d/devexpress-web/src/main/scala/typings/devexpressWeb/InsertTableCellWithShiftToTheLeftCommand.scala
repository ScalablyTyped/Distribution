package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert table cells with a horizontal shift into the selected table.
  */
trait InsertTableCellWithShiftToTheLeftCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableCellWithShiftToTheLeftCommand command.
    */
  def execute(): Boolean
}
object InsertTableCellWithShiftToTheLeftCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableCellWithShiftToTheLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableCellWithShiftToTheLeftCommand]
  }
  
  @scala.inline
  implicit class InsertTableCellWithShiftToTheLeftCommandMutableBuilder[Self <: InsertTableCellWithShiftToTheLeftCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
