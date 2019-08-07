package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side events which concern clicking within editors.
  */
@JSGlobal("ASPxClientEditClickEventArgs")
@js.native
class ASPxClientEditClickEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientEditClickEventArgs type with the specified settings.
    * @param htmlElement An HTML object.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(htmlElement: js.Any, htmlEvent: js.Any) = this()
  /**
    * Gets the HTML element related to the event.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

