package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's style options.
  */
trait ChangeTableLookCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableLookCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableLookSettings object containing the settings that modify the table appearance.
    */
  def execute(settings: TableLookSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableLookSettings]
}
object ChangeTableLookCommand {
  
  @scala.inline
  def apply(execute: TableLookSettings => Boolean, getState: () => CommandState[TableLookSettings]): ChangeTableLookCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableLookCommand]
  }
  
  @scala.inline
  implicit class ChangeTableLookCommandMutableBuilder[Self <: ChangeTableLookCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: TableLookSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[TableLookSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
