package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which involve clicking on the control's items.
  */
@JSGlobal("ASPxClientCloudControlItemEventArgs")
@js.native
class ASPxClientCloudControlItemEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCloudControlItemEventArgs {
  /**
    * Initializes a new object of the ASPxClientCloudControlItemEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param name A string value that identifies the item related to the event.
    * @param htmlElement An HTML object that contains the processed item.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(processOnServer: Boolean, name: String, htmlElement: js.Any, htmlEvent: js.Any) = this()
  /**
    * Gets the HTML object that contains the processed item.
    */
  /* CompleteClass */
  override var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets the name that uniquely identifies the processed item.
    */
  /* CompleteClass */
  override var name: js.Any = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

