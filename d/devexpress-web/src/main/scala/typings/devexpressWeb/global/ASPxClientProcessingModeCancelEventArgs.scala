package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable client-side events which allow the event's processing to be passed to the server side.
  */
@JSGlobal("ASPxClientProcessingModeCancelEventArgs")
@js.native
class ASPxClientProcessingModeCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientProcessingModeCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientProcessingModeCancelEventArgs object.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side. Initializes the ASPxClientProcessingModeEventArgs.processOnServer property.
    */
  def this(processOnServer: Boolean) = this()
}

