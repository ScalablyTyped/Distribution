package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events that relate to command processing (ASPxClientHtmlEditor.CommandExecuted, ASPxClientHtmlEditor.CustomCommand).
  */
@js.native
trait ASPxClientHtmlEditorCommandEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any = js.native
}
object ASPxClientHtmlEditorCommandEventArgs {
  
  @scala.inline
  def apply(commandName: String, parameter: js.Any): ASPxClientHtmlEditorCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCommandEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorCommandEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: js.Any): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
