package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientButtonEditBase.ButtonClick event.
  */
@JSGlobal("ASPxClientButtonEditClickEventArgs")
@js.native
class ASPxClientButtonEditClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientButtonEditClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientButtonEditClickEventArgs object with the specified parameters.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side. Initializes the ASPxClientProcessingModeEventArgs.processOnServer property.
    * @param buttonIndex An integer value representing the zero based index of the clicked button. Initializes the ASPxClientButtonEditClickEventArgs.buttonIndex property.
    */
  def this(processOnServer: Boolean, buttonIndex: Double) = this()
  /**
    * Gets the index of the clicked button.
    */
  /* CompleteClass */
  override var buttonIndex: Double = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

