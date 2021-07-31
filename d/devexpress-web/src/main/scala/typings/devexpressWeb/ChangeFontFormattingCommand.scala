package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the font formatting of characters in a selected range.
  */
trait ChangeFontFormattingCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeFontFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A  FontFormattingSettings object specifying font formatting settings.
    */
  def execute(settings: FontFormattingSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[FontFormattingSettings]
}
object ChangeFontFormattingCommand {
  
  @scala.inline
  def apply(execute: FontFormattingSettings => Boolean, getState: () => CommandState[FontFormattingSettings]): ChangeFontFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFontFormattingCommand]
  }
  
  @scala.inline
  implicit class ChangeFontFormattingCommandMutableBuilder[Self <: ChangeFontFormattingCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: FontFormattingSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[FontFormattingSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
