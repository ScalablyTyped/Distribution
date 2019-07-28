package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ErrorAlertDisplaying event.
  */
trait ASPxClientFileManagerErrorAlertDisplayingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    * Value: A string value that is the processed command's name.
    */
  var commandName: String
  /**
    * Gets or sets the errors description.
    * Value: A string that is the errors description.
    */
  var errorText: String
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the event fires.
    * Value: true to display an alert message; otherwise, false.
    */
  var showAlert: Boolean
}

object ASPxClientFileManagerErrorAlertDisplayingEventArgs {
  @scala.inline
  def apply(commandName: String, errorText: String, showAlert: Boolean): ASPxClientFileManagerErrorAlertDisplayingEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName, errorText = errorText, showAlert = showAlert)
  
    __obj.asInstanceOf[ASPxClientFileManagerErrorAlertDisplayingEventArgs]
  }
}

