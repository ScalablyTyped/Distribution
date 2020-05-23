package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ErrorOccurred event.
  */
@JSGlobal("ASPxClientFileManagerErrorEventArgs")
@js.native
class ASPxClientFileManagerErrorEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerErrorEventArgs {
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
  override var commandName: String = js.native
  /**
    * Gets a specifically generated code that uniquely identifies an error, which occurs while editing an item.
    */
  /* CompleteClass */
  override var errorCode: Double = js.native
  /**
    * Gets or sets the error description.
    */
  /* CompleteClass */
  override var errorText: String = js.native
  /**
    * Gets or sets a value specifying whether an event error message is sent to the ASPxClientFileManager.ErrorAlertDisplaying event.
    */
  /* CompleteClass */
  override var showAlert: Boolean = js.native
}

