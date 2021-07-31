package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to hide the search results.
  */
trait HideFindResultsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the HideFindResultsCommand command.
    */
  def execute(): Boolean
}
object HideFindResultsCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): HideFindResultsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[HideFindResultsCommand]
  }
  
  @scala.inline
  implicit class HideFindResultsCommandMutableBuilder[Self <: HideFindResultsCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
