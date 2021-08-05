package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a text box' content margins.
  */
trait ChangeTextBoxContentMarginsCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTextBoxContentMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A Margins object specifying margin settings.
    */
  def execute(settings: Margins): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Margins]
}
object ChangeTextBoxContentMarginsCommand {
  
  inline def apply(execute: Margins => Boolean, getState: () => CommandState[Margins]): ChangeTextBoxContentMarginsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTextBoxContentMarginsCommand]
  }
  
  extension [Self <: ChangeTextBoxContentMarginsCommand](x: Self) {
    
    inline def setExecute(value: Margins => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[Margins]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
