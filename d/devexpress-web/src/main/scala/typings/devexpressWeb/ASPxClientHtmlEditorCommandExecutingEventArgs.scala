package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.CommandExecuting event.
  */
@js.native
trait ASPxClientHtmlEditorCommandExecutingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any = js.native
}
object ASPxClientHtmlEditorCommandExecutingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, commandName: String, parameter: js.Any): ASPxClientHtmlEditorCommandExecutingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandExecutingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCommandExecutingEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorCommandExecutingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: js.Any): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
