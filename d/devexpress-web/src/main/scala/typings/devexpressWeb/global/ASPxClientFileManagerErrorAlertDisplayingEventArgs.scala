package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ErrorAlertDisplaying event.
  */
@JSGlobal("ASPxClientFileManagerErrorAlertDisplayingEventArgs")
@js.native
class ASPxClientFileManagerErrorAlertDisplayingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerErrorAlertDisplayingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerErrorAlertDisplayingEventArgs class with the specified settings.
    * @param commandName A String value that specifies the name of the processed command. Initializes the ASPxClientFileManagerErrorAlertDisplayingEventArgs.commandName property.
    * @param errorText A String value that specifies the error text. This value is assigned to the ASPxClientFileManagerErrorAlertDisplayingEventArgs.errorText property.
    */
  def this(commandName: String, errorText: String) = this()
  /**
    * Gets the name of the processed command.
    */
  /* CompleteClass */
  override var commandName: String = js.native
  /**
    * Gets or sets the errors description.
    */
  /* CompleteClass */
  override var errorText: String = js.native
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the event fires.
    */
  /* CompleteClass */
  override var showAlert: Boolean = js.native
}

