package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern clicking on the control's group headers.
  */
@JSGlobal("ASPxClientNavBarGroupClickEventArgs")
@js.native
class ASPxClientNavBarGroupClickEventArgs protected () extends ASPxClientNavBarGroupCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarGroupClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param group An ASPxClientNavBarGroup object that represents a group related to the event.
    * @param htmlElement An HTML object that contains the processed navbar group.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(processOnServer: Boolean, group: ASPxClientNavBarGroup, htmlElement: js.Any, htmlEvent: js.Any) = this()
  /**
    * Gets the HTML object that contains the processed group.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

