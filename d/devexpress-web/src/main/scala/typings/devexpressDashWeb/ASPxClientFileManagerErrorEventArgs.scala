package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ErrorOccurred event.
  */
trait ASPxClientFileManagerErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    * Value: A string value representing the processed command's name.
    */
  var commandName: String
  /**
    * Gets a specifically generated code that uniquely identifies an error, which occurs while editing an item.
    * Value: An integer value that specifies the code uniquely identifying an error.
    */
  var errorCode: Double
  /**
    * Gets or sets the error description.
    * Value: A string value specifying the error description.
    */
  var errorText: String
  /**
    * Gets or sets a value specifying whether an event error message is sent to the ErrorAlertDisplaying event.
    * Value: true to sent an error message; otherwise, false.
    */
  var showAlert: Boolean
}

object ASPxClientFileManagerErrorEventArgs {
  @scala.inline
  def apply(commandName: String, errorCode: Double, errorText: String, showAlert: Boolean): ASPxClientFileManagerErrorEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName, errorCode = errorCode, errorText = errorText, showAlert = showAlert)
  
    __obj.asInstanceOf[ASPxClientFileManagerErrorEventArgs]
  }
}

