package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a caption for an equation.
  */
@js.native
trait InsertEquationsCaptionCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertEquationsCaptionCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertEquationsCaptionCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertEquationsCaptionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertEquationsCaptionCommand]
  }
  
  @scala.inline
  implicit class InsertEquationsCaptionCommandMutableBuilder[Self <: InsertEquationsCaptionCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
