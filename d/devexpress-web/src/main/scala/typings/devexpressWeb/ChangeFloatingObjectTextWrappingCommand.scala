package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's text wrapping settings.
  */
@js.native
trait ChangeFloatingObjectTextWrappingCommand extends StObject {
  
  /**
    * Executes the ChangeFloatingObjectTextWrappingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A FloatingObjectTextWrappingSettings object specifying text wrapping settings.
    */
  def execute(settings: FloatingObjectTextWrappingSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[FloatingObjectTextWrappingSettings] = js.native
}
object ChangeFloatingObjectTextWrappingCommand {
  
  @scala.inline
  def apply(
    execute: FloatingObjectTextWrappingSettings => Boolean,
    getState: () => CommandState[FloatingObjectTextWrappingSettings]
  ): ChangeFloatingObjectTextWrappingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectTextWrappingCommand]
  }
  
  @scala.inline
  implicit class ChangeFloatingObjectTextWrappingCommandMutableBuilder[Self <: ChangeFloatingObjectTextWrappingCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: FloatingObjectTextWrappingSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[FloatingObjectTextWrappingSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
