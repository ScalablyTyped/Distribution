package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
@JSGlobal("ASPxClientGlobalBeginCallbackEventArgs")
@js.native
class ASPxClientGlobalBeginCallbackEventArgs protected () extends ASPxClientBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGlobalBeginCallbackEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param command A string value that is the name of the command that initiated a callback.
    */
  def this(control: ASPxClientControl, command: String) = this()
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl = js.native
}

