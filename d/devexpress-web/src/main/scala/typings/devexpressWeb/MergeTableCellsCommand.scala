package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to merge the selected table cells.
  */
trait MergeTableCellsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MergeTableCellsCommand command.
    */
  def execute(): Boolean
}
object MergeTableCellsCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MergeTableCellsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MergeTableCellsCommand]
  }
  
  @scala.inline
  implicit class MergeTableCellsCommandMutableBuilder[Self <: MergeTableCellsCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
