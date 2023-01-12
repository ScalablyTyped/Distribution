package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for commands with a simple common command state.
  */
trait CommandWithSimpleStateBase
  extends StObject
     with CommandBase {
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object CommandWithSimpleStateBase {
  
  inline def apply(getState: () => SimpleCommandState): CommandWithSimpleStateBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CommandWithSimpleStateBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandWithSimpleStateBase] (val x: Self) extends AnyVal {
    
    inline def setGetState(value: () => SimpleCommandState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
