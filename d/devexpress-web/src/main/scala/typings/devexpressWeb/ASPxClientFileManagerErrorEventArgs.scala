package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ErrorOccurred event.
  */
trait ASPxClientFileManagerErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  /**
    * Gets a specifically generated code that uniquely identifies an error, which occurs while editing an item.
    */
  var errorCode: Double
  /**
    * Gets or sets the error description.
    */
  var errorText: String
  /**
    * Gets or sets a value specifying whether an event error message is sent to the ASPxClientFileManager.ErrorAlertDisplaying event.
    */
  var showAlert: Boolean
}

object ASPxClientFileManagerErrorEventArgs {
  @scala.inline
  def apply(commandName: String, errorCode: Double, errorText: String, showAlert: Boolean): ASPxClientFileManagerErrorEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerErrorEventArgs]
  }
}

