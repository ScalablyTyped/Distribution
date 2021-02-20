package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for commands with a simple common command state.
  */
@js.native
trait CommandWithSimpleStateBase extends CommandBase {
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}
object CommandWithSimpleStateBase {
  
  @scala.inline
  def apply(getState: () => SimpleCommandState): CommandWithSimpleStateBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CommandWithSimpleStateBase]
  }
  
  @scala.inline
  implicit class CommandWithSimpleStateBaseMutableBuilder[Self <: CommandWithSimpleStateBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetState(value: () => SimpleCommandState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
