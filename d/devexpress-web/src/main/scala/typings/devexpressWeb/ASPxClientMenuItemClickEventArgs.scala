package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern clicking on the control's items.
  */
trait ASPxClientMenuItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem
}

object ASPxClientMenuItemClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, item: ASPxClientMenuItem, processOnServer: Boolean): ASPxClientMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemClickEventArgs]
  }
}

