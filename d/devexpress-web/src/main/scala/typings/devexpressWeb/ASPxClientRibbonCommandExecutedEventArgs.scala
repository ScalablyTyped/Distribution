package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.CommandExecuted event.
  */
trait ASPxClientRibbonCommandExecutedEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets an item object related to the event.
    */
  var item: ASPxClientRibbonItem
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: String
}
object ASPxClientRibbonCommandExecutedEventArgs {
  
  inline def apply(item: ASPxClientRibbonItem, parameter: String, processOnServer: Boolean): ASPxClientRibbonCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonCommandExecutedEventArgs]
  }
  
  extension [Self <: ASPxClientRibbonCommandExecutedEventArgs](x: Self) {
    
    inline def setItem(value: ASPxClientRibbonItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
