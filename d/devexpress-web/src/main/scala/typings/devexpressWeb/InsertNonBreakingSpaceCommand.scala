package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add a non-breaking space in place of a selected range.
  */
@js.native
trait InsertNonBreakingSpaceCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertNonBreakingSpaceCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertNonBreakingSpaceCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertNonBreakingSpaceCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertNonBreakingSpaceCommand]
  }
  
  @scala.inline
  implicit class InsertNonBreakingSpaceCommandMutableBuilder[Self <: InsertNonBreakingSpaceCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
