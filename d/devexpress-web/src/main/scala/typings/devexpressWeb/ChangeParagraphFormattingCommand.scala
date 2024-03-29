package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the formatting of paragraphs in a selected range.
  */
trait ChangeParagraphFormattingCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeParagraphFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A ParagraphFormattingSettings object specifying paragraph formatting settings.
    */
  def execute(settings: ParagraphFormattingSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[ParagraphFormattingSettings]
}
object ChangeParagraphFormattingCommand {
  
  inline def apply(
    execute: ParagraphFormattingSettings => Boolean,
    getState: () => CommandState[ParagraphFormattingSettings]
  ): ChangeParagraphFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeParagraphFormattingCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeParagraphFormattingCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: ParagraphFormattingSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[ParagraphFormattingSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
