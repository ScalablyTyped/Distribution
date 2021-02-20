package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a section break and start a new section on the next even-numbered page.
  */
@js.native
trait InsertSectionBreakEvenPageCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertSectionBreakEvenPageCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertSectionBreakEvenPageCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertSectionBreakEvenPageCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSectionBreakEvenPageCommand]
  }
  
  @scala.inline
  implicit class InsertSectionBreakEvenPageCommandMutableBuilder[Self <: InsertSectionBreakEvenPageCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
