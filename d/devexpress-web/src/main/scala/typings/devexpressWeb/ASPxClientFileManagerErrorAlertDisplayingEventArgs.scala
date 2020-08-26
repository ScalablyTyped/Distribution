package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ErrorAlertDisplaying event.
  */
@js.native
trait ASPxClientFileManagerErrorAlertDisplayingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  /**
    * Gets or sets the errors description.
    */
  var errorText: String = js.native
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the event fires.
    */
  var showAlert: Boolean = js.native
}

object ASPxClientFileManagerErrorAlertDisplayingEventArgs {
  @scala.inline
  def apply(commandName: String, errorText: String, showAlert: Boolean): ASPxClientFileManagerErrorAlertDisplayingEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerErrorAlertDisplayingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerErrorAlertDisplayingEventArgsOps[Self <: ASPxClientFileManagerErrorAlertDisplayingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowAlert(value: Boolean): Self = this.set("showAlert", value.asInstanceOf[js.Any])
  }
  
}

