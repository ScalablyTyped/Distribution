package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's formatting.
  */
trait ChangeTableFormattingCommand extends StObject {
  
  /**
    * Executes the ChangeTableFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object containing the settings to format a table.
    */
  def execute(settings: TableFormattingSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableFormattingSettings]
}
object ChangeTableFormattingCommand {
  
  inline def apply(execute: TableFormattingSettings => Boolean, getState: () => CommandState[TableFormattingSettings]): ChangeTableFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableFormattingCommand]
  }
  
  extension [Self <: ChangeTableFormattingCommand](x: Self) {
    
    inline def setExecute(value: TableFormattingSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[TableFormattingSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
