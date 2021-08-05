package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's preferred column width.
  */
trait ChangeTableColumnPreferredWidthCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableColumnPreferredWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table columns.
    */
  def execute(preferredWidth: TableWidthUnit): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableWidthUnit]
}
object ChangeTableColumnPreferredWidthCommand {
  
  inline def apply(execute: TableWidthUnit => Boolean, getState: () => CommandState[TableWidthUnit]): ChangeTableColumnPreferredWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableColumnPreferredWidthCommand]
  }
  
  extension [Self <: ChangeTableColumnPreferredWidthCommand](x: Self) {
    
    inline def setExecute(value: TableWidthUnit => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[TableWidthUnit]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
