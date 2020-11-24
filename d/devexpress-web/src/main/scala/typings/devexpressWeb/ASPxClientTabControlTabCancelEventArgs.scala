package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancellable events which concern manipulations on tabs.
  */
@js.native
trait ASPxClientTabControlTabCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets or sets a value specifying whether a callback should be sent to the server to reload the content of the page being activated.
    */
  var reloadContentOnCallback: Boolean = js.native
  
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientTab = js.native
}
object ASPxClientTabControlTabCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, processOnServer: Boolean, reloadContentOnCallback: Boolean, tab: ASPxClientTab): ASPxClientTabControlTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlTabCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTabControlTabCancelEventArgsOps[Self <: ASPxClientTabControlTabCancelEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReloadContentOnCallback(value: Boolean): Self = this.set("reloadContentOnCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: ASPxClientTab): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
}
