package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to restart the numbering list.
  */
@js.native
trait RestartNumberingListCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the RestartNumberingListCommand command.
    */
  def execute(): Boolean = js.native
}
object RestartNumberingListCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RestartNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RestartNumberingListCommand]
  }
  
  @scala.inline
  implicit class RestartNumberingListCommandMutableBuilder[Self <: RestartNumberingListCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
