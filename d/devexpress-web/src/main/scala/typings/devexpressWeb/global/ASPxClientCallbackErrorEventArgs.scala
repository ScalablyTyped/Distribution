package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to server-side errors that occured during callback processing.
  */
@JSGlobal("ASPxClientCallbackErrorEventArgs")
@js.native
class ASPxClientCallbackErrorEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCallbackErrorEventArgs {
  /**
    * Initializes a new ASPxClientCallbackErrorEventArgs object with the specified settings.
    * @param message A string value that specifies the error message.
    */
  def this(message: String) = this()
  /**
    * Gets or sets whether the event is handled and the default error handling actions are not required.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Gets the error message that describes the server error that occurred.
    */
  /* CompleteClass */
  override var message: String = js.native
}

