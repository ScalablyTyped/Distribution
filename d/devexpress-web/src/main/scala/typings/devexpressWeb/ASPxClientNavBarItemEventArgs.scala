package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on items.
  */
trait ASPxClientNavBarItemEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the HTML object that contains the processed navbar item.
    */
  var htmlElement: js.Any
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  /**
    * Gets the item object related to the event.
    */
  var item: ASPxClientNavBarItem
}

object ASPxClientNavBarItemEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, item: ASPxClientNavBarItem, processOnServer: Boolean): ASPxClientNavBarItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarItemEventArgs]
  }
}

