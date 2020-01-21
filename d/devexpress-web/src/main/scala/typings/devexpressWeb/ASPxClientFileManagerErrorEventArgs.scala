package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ErrorOccurred event.
  */
@JSGlobal("ASPxClientFileManagerErrorEventArgs")
@js.native
class ASPxClientFileManagerErrorEventArgs protected () extends ASPxClientEventArgs {
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
  var commandName: String = js.native
  /**
    * Gets a specifically generated code that uniquely identifies an error, which occurs while editing an item.
    */
  var errorCode: Double = js.native
  /**
    * Gets or sets the error description.
    */
  var errorText: String = js.native
  /**
    * Gets or sets a value specifying whether an event error message is sent to the ASPxClientFileManager.ErrorAlertDisplaying event.
    */
  var showAlert: Boolean = js.native
}

