package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to clicking on the control's items.
  */
trait BootstrapClientMenuItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets an HTML object that contains the processed Menu item.
    */
  var htmlElement: js.Any
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  /**
    * Gets the menu item object related to the event.
    */
  var item: BootstrapClientMenuItem
}

object BootstrapClientMenuItemClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, item: BootstrapClientMenuItem, processOnServer: Boolean): BootstrapClientMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItemClickEventArgs]
  }
}

