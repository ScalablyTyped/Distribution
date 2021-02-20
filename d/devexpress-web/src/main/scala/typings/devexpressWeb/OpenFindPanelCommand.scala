package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Search Panel allowing end-users to search text and navigate through search results.
  */
@js.native
trait OpenFindPanelCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenFindPanelCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenFindPanelCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenFindPanelCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenFindPanelCommand]
  }
  
  @scala.inline
  implicit class OpenFindPanelCommandMutableBuilder[Self <: OpenFindPanelCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
