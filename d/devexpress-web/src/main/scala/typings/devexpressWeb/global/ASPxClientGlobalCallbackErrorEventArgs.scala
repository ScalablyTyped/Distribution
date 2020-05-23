package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.CallbackError event.
  */
@JSGlobal("ASPxClientGlobalCallbackErrorEventArgs")
@js.native
class ASPxClientGlobalCallbackErrorEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGlobalCallbackErrorEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGlobalCallbackErrorEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param message A string value that is the error message.
    */
  def this(control: typings.devexpressWeb.ASPxClientControl, message: String) = this()
  /**
    * Gets an object that initiated a callback.
    */
  /* CompleteClass */
  override var control: typings.devexpressWeb.ASPxClientControl = js.native
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

