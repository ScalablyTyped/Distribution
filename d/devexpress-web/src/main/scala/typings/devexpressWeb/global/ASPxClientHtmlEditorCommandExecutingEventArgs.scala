package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.CommandExecuting event.
  */
@JSGlobal("ASPxClientHtmlEditorCommandExecutingEventArgs")
@js.native
open class ASPxClientHtmlEditorCommandExecutingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorCommandExecutingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCommandExecutingEventArgs object with the specified settings.
    * @param commandName A string value that identifies the command currently being executed. Initializes the ASPxClientHtmlEditorCommandExecutingEventArgs.commandName property.
    * @param parameter An object that contains the command specific information needed for handling the command execution. Initializes the ASPxClientHtmlEditorCommandExecutingEventArgs.parameter property.
    */
  def this(commandName: String, parameter: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the name of the processed command.
    */
  /* CompleteClass */
  var commandName: String = js.native
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  /* CompleteClass */
  var parameter: Any = js.native
}
