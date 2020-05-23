package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
trait ASPxClientDockManagerCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel
}

object ASPxClientDockManagerCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, panel: ASPxClientDockPanel): ASPxClientDockManagerCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerCancelEventArgs]
  }
}

