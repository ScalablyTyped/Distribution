package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ErrorOccurred event.
  */
@js.native
trait ASPxClientFileManagerErrorEventArgs extends ASPxClientEventArgs {
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

object ASPxClientFileManagerErrorEventArgs {
  @scala.inline
  def apply(commandName: String, errorCode: Double, errorText: String, showAlert: Boolean): ASPxClientFileManagerErrorEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerErrorEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerErrorEventArgsOps[Self <: ASPxClientFileManagerErrorEventArgs] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowAlert(value: Boolean): Self = this.set("showAlert", value.asInstanceOf[js.Any])
  }
  
}

