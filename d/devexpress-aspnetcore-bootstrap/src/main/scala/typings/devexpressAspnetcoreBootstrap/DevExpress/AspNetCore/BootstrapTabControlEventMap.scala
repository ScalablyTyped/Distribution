package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTabControlEventMap extends ControlEventMap {
  
  var activeTabChanged: TabControlTabEventArgs = js.native
  
  var activeTabChanging: TabControlTabCancelEventArgs = js.native
  
  var beginCallback: BeginCallbackEventArgs = js.native
  
  var callbackError: CallbackErrorEventArgs = js.native
  
  var endCallback: EndCallbackEventArgs = js.native
  
  var tabClick: TabControlTabClickEventArgs = js.native
}
object BootstrapTabControlEventMap {
  
  @scala.inline
  def apply(
    activeTabChanged: TabControlTabEventArgs,
    activeTabChanging: TabControlTabCancelEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    endCallback: EndCallbackEventArgs,
    init: EventArgs,
    tabClick: TabControlTabClickEventArgs
  ): BootstrapTabControlEventMap = {
    val __obj = js.Dynamic.literal(activeTabChanged = activeTabChanged.asInstanceOf[js.Any], activeTabChanging = activeTabChanging.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], tabClick = tabClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTabControlEventMap]
  }
  
  @scala.inline
  implicit class BootstrapTabControlEventMapOps[Self <: BootstrapTabControlEventMap] (val x: Self) extends AnyVal {
    
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
    def setActiveTabChanged(value: TabControlTabEventArgs): Self = this.set("activeTabChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTabChanging(value: TabControlTabCancelEventArgs): Self = this.set("activeTabChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = this.set("beginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = this.set("callbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = this.set("endCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabClick(value: TabControlTabClickEventArgs): Self = this.set("tabClick", value.asInstanceOf[js.Any])
  }
}
