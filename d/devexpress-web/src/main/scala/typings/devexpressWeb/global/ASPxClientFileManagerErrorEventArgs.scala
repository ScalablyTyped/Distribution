package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ErrorOccurred event.
  */
@JSGlobal("ASPxClientFileManagerErrorEventArgs")
@js.native
open class ASPxClientFileManagerErrorEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerErrorEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerErrorEventArgs class.
    * @param commandName A string value that specifies the name of the processed command.
    * @param errorText A string value that specifies the error description.
    * @param errorCode An integer value that specifies the error code.
    */
  def this(commandName: String, errorText: String, errorCode: Double) = this()
  
  /**
    * Gets the name of the processed command.
    */
  /* CompleteClass */
  var commandName: String = js.native
  
  /**
    * Gets a specifically generated code that uniquely identifies an error, which occurs while editing an item.
    */
  /* CompleteClass */
  var errorCode: Double = js.native
  
  /**
    * Gets or sets the error description.
    */
  /* CompleteClass */
  var errorText: String = js.native
  
  /**
    * Gets or sets a value specifying whether an event error message is sent to the ASPxClientFileManager.ErrorAlertDisplaying event.
    */
  /* CompleteClass */
  var showAlert: Boolean = js.native
}
