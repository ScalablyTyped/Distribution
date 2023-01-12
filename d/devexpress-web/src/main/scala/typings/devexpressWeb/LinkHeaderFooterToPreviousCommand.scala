package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to link a header/footer to the previous section, so it has the same content.
  */
trait LinkHeaderFooterToPreviousCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the LinkHeaderFooterToPreviousCommand command.
    */
  def execute(): Boolean
}
object LinkHeaderFooterToPreviousCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): LinkHeaderFooterToPreviousCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[LinkHeaderFooterToPreviousCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkHeaderFooterToPreviousCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
