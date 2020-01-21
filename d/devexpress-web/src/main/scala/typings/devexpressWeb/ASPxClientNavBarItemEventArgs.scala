package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on items.
  */
@JSGlobal("ASPxClientNavBarItemEventArgs")
@js.native
class ASPxClientNavBarItemEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarItemEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param item An ASPxClientNavBarItem object that represents an item related to the event.
    * @param htmlElement An HTML object that contains the processed navbar item.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(processOnServer: Boolean, item: ASPxClientNavBarItem, htmlElement: js.Any, htmlEvent: js.Any) = this()
  /**
    * Gets the HTML object that contains the processed navbar item.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets the item object related to the event.
    */
  var item: ASPxClientNavBarItem = js.native
}

