package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's text wrapping settings.
  */
trait ChangeFloatingObjectTextWrappingCommand extends StObject {
  
  /**
    * Executes the ChangeFloatingObjectTextWrappingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A FloatingObjectTextWrappingSettings object specifying text wrapping settings.
    */
  def execute(settings: FloatingObjectTextWrappingSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[FloatingObjectTextWrappingSettings]
}
object ChangeFloatingObjectTextWrappingCommand {
  
  inline def apply(
    execute: FloatingObjectTextWrappingSettings => Boolean,
    getState: () => CommandState[FloatingObjectTextWrappingSettings]
  ): ChangeFloatingObjectTextWrappingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectTextWrappingCommand]
  }
  
  extension [Self <: ChangeFloatingObjectTextWrappingCommand](x: Self) {
    
    inline def setExecute(value: FloatingObjectTextWrappingSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[FloatingObjectTextWrappingSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
