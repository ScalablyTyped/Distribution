package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancellable events which concern manipulations on tabs.
  */
trait ASPxClientTabControlTabCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets or sets a value specifying whether a callback should be sent to the server to reload the content of the page being activated.
    */
  var reloadContentOnCallback: Boolean
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientTab
}

object ASPxClientTabControlTabCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, processOnServer: Boolean, reloadContentOnCallback: Boolean, tab: ASPxClientTab): ASPxClientTabControlTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlTabCancelEventArgs]
  }
}

