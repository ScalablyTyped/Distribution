package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the cell formatting of the selected table elements.
  */
@js.native
trait ChangeTableCellFormattingCommand extends StObject {
  
  /**
    * Executes the ChangeTableCellFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object specifying cell formatting of the selected table elements.
    */
  def execute(settings: TableCellFormattingSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableCellFormattingSettings] = js.native
}
object ChangeTableCellFormattingCommand {
  
  @scala.inline
  def apply(
    execute: TableCellFormattingSettings => Boolean,
    getState: () => CommandState[TableCellFormattingSettings]
  ): ChangeTableCellFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableCellFormattingCommand]
  }
  
  @scala.inline
  implicit class ChangeTableCellFormattingCommandMutableBuilder[Self <: ChangeTableCellFormattingCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: TableCellFormattingSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[TableCellFormattingSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
