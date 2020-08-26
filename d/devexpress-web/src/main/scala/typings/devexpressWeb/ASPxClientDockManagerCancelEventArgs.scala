package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@js.native
trait ASPxClientDockManagerCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}

object ASPxClientDockManagerCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, panel: ASPxClientDockPanel): ASPxClientDockManagerCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerCancelEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDockManagerCancelEventArgsOps[Self <: ASPxClientDockManagerCancelEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPanel(value: ASPxClientDockPanel): Self = this.set("panel", value.asInstanceOf[js.Any])
  }
  
}

