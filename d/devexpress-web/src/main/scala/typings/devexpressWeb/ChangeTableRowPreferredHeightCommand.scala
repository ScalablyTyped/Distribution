package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's preferred row height.
  */
trait ChangeTableRowPreferredHeightCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableRowPreferredHeightCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredHeight A TableHeightUnit object specifying preferred height of the selected table rows.
    */
  def execute(preferredHeight: TableHeightUnit): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableHeightUnit]
}
object ChangeTableRowPreferredHeightCommand {
  
  inline def apply(execute: TableHeightUnit => Boolean, getState: () => CommandState[TableHeightUnit]): ChangeTableRowPreferredHeightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableRowPreferredHeightCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeTableRowPreferredHeightCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: TableHeightUnit => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[TableHeightUnit]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
