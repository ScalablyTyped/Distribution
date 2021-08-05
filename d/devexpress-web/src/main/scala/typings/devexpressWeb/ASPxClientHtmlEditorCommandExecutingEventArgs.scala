package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.CommandExecuting event.
  */
trait ASPxClientHtmlEditorCommandExecutingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any
}
object ASPxClientHtmlEditorCommandExecutingEventArgs {
  
  inline def apply(cancel: Boolean, commandName: String, parameter: js.Any): ASPxClientHtmlEditorCommandExecutingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandExecutingEventArgs]
  }
  
  extension [Self <: ASPxClientHtmlEditorCommandExecutingEventArgs](x: Self) {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: js.Any): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
