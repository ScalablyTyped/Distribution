package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.EndCallback event.
  */
@JSGlobal("ASPxClientGlobalEndCallbackEventArgs")
@js.native
class ASPxClientGlobalEndCallbackEventArgs protected () extends ASPxClientEndCallbackEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGlobalEndCallbackEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    */
  def this(control: ASPxClientControl) = this()
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl = js.native
}

