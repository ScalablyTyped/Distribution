package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern clicking on the control's tabs.
  */
trait ASPxClientTabControlTabClickEventArgs extends ASPxClientTabControlTabCancelEventArgs {
  /**
    * Gets the HTML object that contains the processed tab.
    * Value: An object representing a container for the tab related to the event.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
}

object ASPxClientTabControlTabClickEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: scala.Boolean,
    reloadContentOnCallback: scala.Boolean,
    tab: ASPxClientTab
  ): ASPxClientTabControlTabClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlElement = htmlElement, htmlEvent = htmlEvent, processOnServer = processOnServer, reloadContentOnCallback = reloadContentOnCallback, tab = tab)
  
    __obj.asInstanceOf[ASPxClientTabControlTabClickEventArgs]
  }
}

