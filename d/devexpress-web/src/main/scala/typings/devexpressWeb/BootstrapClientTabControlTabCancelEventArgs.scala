package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancellable events related to manipulations on tabs.
  */
trait BootstrapClientTabControlTabCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets or sets a value specifying whether a callback should be sent to the server to reload the content of the page being activated.
    */
  var reloadContentOnCallback: Boolean
  /**
    * Gets the tab object related to the event.
    */
  var tab: BootstrapClientTab
}

object BootstrapClientTabControlTabCancelEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    tab: BootstrapClientTab
  ): BootstrapClientTabControlTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTabControlTabCancelEventArgs]
  }
}

