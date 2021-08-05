package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.CustomCommandExecuted event.
  */
trait ASPxClientSpreadsheetCustomCommandExecutedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  
  /** @deprecated This property is now obsolete. Use the commandName property instead. */
  /**
    * This property is now obsolete. Use the ASPxClientSpreadsheetCustomCommandExecutedEventArgs.commandName property instead.
    */
  var item: ASPxClientRibbonItem
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: String
}
object ASPxClientSpreadsheetCustomCommandExecutedEventArgs {
  
  inline def apply(commandName: String, item: ASPxClientRibbonItem, parameter: String): ASPxClientSpreadsheetCustomCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCustomCommandExecutedEventArgs]
  }
  
  extension [Self <: ASPxClientSpreadsheetCustomCommandExecutedEventArgs](x: Self) {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ASPxClientRibbonItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
