package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern clicking on the control's tabs.
  */
trait ASPxClientTabControlTabClickEventArgs extends ASPxClientTabControlTabCancelEventArgs {
  /**
    * Gets the HTML object that contains the processed tab.
    */
  var htmlElement: js.Any
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}

object ASPxClientTabControlTabClickEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    htmlElement: js.Any,
    htmlEvent: js.Any,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    tab: ASPxClientTab
  ): ASPxClientTabControlTabClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlTabClickEventArgs]
  }
}

