package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for commands with the Boolean state.
  */
trait CommandWithBooleanStateBase
  extends StObject
     with CommandBase {
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}
object CommandWithBooleanStateBase {
  
  @scala.inline
  def apply(getState: () => CommandState[Boolean]): CommandWithBooleanStateBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CommandWithBooleanStateBase]
  }
  
  @scala.inline
  implicit class CommandWithBooleanStateBaseMutableBuilder[Self <: CommandWithBooleanStateBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetState(value: () => CommandState[Boolean]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
