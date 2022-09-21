package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.CustomCommandExecuted event.
  */
@JSGlobal("ASPxClientSpreadsheetCustomCommandExecutedEventArgs")
@js.native
open class ASPxClientSpreadsheetCustomCommandExecutedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSpreadsheetCustomCommandExecutedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetCustomCommandExecutedEventArgs class.
    * @param commandName A string value that specifies the name of the processed command.
    * @param parameter An object that can contain command specific information needed for handling the command execution.
    */
  def this(commandName: String, parameter: Any) = this()
  
  /**
    * Gets the name of the processed command.
    */
  /* CompleteClass */
  var commandName: String = js.native
  
  /** @deprecated This property is now obsolete. Use the commandName property instead. */
  /**
    * This property is now obsolete. Use the ASPxClientSpreadsheetCustomCommandExecutedEventArgs.commandName property instead.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientRibbonItem = js.native
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  /* CompleteClass */
  var parameter: String = js.native
}
