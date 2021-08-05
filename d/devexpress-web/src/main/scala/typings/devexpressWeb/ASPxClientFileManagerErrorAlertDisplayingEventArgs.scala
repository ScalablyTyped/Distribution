package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ErrorAlertDisplaying event.
  */
trait ASPxClientFileManagerErrorAlertDisplayingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  
  /**
    * Gets or sets the errors description.
    */
  var errorText: String
  
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the event fires.
    */
  var showAlert: Boolean
}
object ASPxClientFileManagerErrorAlertDisplayingEventArgs {
  
  inline def apply(commandName: String, errorText: String, showAlert: Boolean): ASPxClientFileManagerErrorAlertDisplayingEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerErrorAlertDisplayingEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerErrorAlertDisplayingEventArgs](x: Self) {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setShowAlert(value: Boolean): Self = StObject.set(x, "showAlert", value.asInstanceOf[js.Any])
  }
}
