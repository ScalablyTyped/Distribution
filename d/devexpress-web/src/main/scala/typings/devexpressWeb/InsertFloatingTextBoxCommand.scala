package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a floating text box.
  */
@js.native
trait InsertFloatingTextBoxCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertFloatingTextBoxCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertFloatingTextBoxCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertFloatingTextBoxCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertFloatingTextBoxCommand]
  }
  
  @scala.inline
  implicit class InsertFloatingTextBoxCommandMutableBuilder[Self <: InsertFloatingTextBoxCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
