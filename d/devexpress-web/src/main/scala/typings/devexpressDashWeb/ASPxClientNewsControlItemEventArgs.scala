package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern tail clicking within the control's items.
  */
@JSGlobal("ASPxClientNewsControlItemEventArgs")
@js.native
class ASPxClientNewsControlItemEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientNewsControlItemEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param name A string value that represents the unique identifier name of an item related to the event.
    * @param htmlElement An HTML object that contains the processed item.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(processOnServer: Boolean, name: String, htmlElement: js.Any, htmlEvent: js.Any) = this()
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets the name that uniquely identifies the processed item.
    */
  var name: js.Any = js.native
}

