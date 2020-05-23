package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events which can't be cancelled and allow the event's processing to be passed to the server side.
  */
@JSGlobal("ASPxClientProcessingModeEventArgs")
@js.native
class ASPxClientProcessingModeEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientProcessingModeEventArgs object.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side. Initializes the ASPxClientProcessingModeEventArgs.processOnServer property.
    */
  def this(processOnServer: Boolean) = this()
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

