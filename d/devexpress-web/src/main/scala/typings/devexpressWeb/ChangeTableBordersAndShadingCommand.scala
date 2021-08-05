package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change borders and shading of the selected table elements.
  */
trait ChangeTableBordersAndShadingCommand extends StObject {
  
  /**
    * Executes the ChangeTableBordersAndShadingCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object with settings specifying table borders.
    * @param applyToWholeTable true to apply the border settings to the whole table, false to apply the border settings to the selected cells.
    */
  def execute(settings: TableBordersSettings, applyToWholeTable: Boolean): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableBordersSettings]
}
object ChangeTableBordersAndShadingCommand {
  
  inline def apply(
    execute: (TableBordersSettings, Boolean) => Boolean,
    getState: () => CommandState[TableBordersSettings]
  ): ChangeTableBordersAndShadingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableBordersAndShadingCommand]
  }
  
  extension [Self <: ChangeTableBordersAndShadingCommand](x: Self) {
    
    inline def setExecute(value: (TableBordersSettings, Boolean) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
    
    inline def setGetState(value: () => CommandState[TableBordersSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
