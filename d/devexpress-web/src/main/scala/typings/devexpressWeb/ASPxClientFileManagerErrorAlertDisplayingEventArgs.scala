package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ErrorAlertDisplaying event.
  */
trait ASPxClientFileManagerErrorAlertDisplayingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  /**
    * Gets or sets the errors description.
    */
  var errorText: String
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the event fires.
    */
  var showAlert: Boolean
}

object ASPxClientFileManagerErrorAlertDisplayingEventArgs {
  @scala.inline
  def apply(commandName: String, errorText: String, showAlert: Boolean): ASPxClientFileManagerErrorAlertDisplayingEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerErrorAlertDisplayingEventArgs]
  }
}

