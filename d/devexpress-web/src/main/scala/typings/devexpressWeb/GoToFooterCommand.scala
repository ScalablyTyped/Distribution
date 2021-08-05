package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the page footer from the page header in the header/footer editing mode.
  */
trait GoToFooterCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToFooterCommand command.
    */
  def execute(): Boolean
}
object GoToFooterCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToFooterCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToFooterCommand]
  }
  
  extension [Self <: GoToFooterCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
