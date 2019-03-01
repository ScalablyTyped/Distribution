package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancellable events which concern manipulations on tabs.
  */
trait ASPxClientTabControlTabCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets or sets a value specifying whether a callback should be sent to the server to reload the content of the page being activated.
    * Value: true to reload the page's content; otherwise, false.
    */
  var reloadContentOnCallback: scala.Boolean
  /**
    * Gets the tab object related to the event.
    * Value: An ASPxClientTab object representing the tab manipulations on which forced the tab control to raise the event.
    */
  var tab: ASPxClientTab
}

object ASPxClientTabControlTabCancelEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    processOnServer: scala.Boolean,
    reloadContentOnCallback: scala.Boolean,
    tab: ASPxClientTab
  ): ASPxClientTabControlTabCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("reloadContentOnCallback")(reloadContentOnCallback)
    __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[ASPxClientTabControlTabCancelEventArgs]
  }
}

