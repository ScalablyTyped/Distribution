package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to create a table of figures.
  */
@js.native
trait InsertTableOfFiguresCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableOfFiguresCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertTableOfFiguresCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfFiguresCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfFiguresCommand]
  }
  
  @scala.inline
  implicit class InsertTableOfFiguresCommandMutableBuilder[Self <: InsertTableOfFiguresCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
