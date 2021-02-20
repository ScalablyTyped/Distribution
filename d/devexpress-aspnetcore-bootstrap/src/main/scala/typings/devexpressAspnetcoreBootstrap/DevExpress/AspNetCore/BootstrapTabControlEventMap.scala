package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
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
  implicit class BootstrapTabControlEventMapMutableBuilder[Self <: BootstrapTabControlEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTabChanged(value: TabControlTabEventArgs): Self = StObject.set(x, "activeTabChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTabChanging(value: TabControlTabCancelEventArgs): Self = StObject.set(x, "activeTabChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabClick(value: TabControlTabClickEventArgs): Self = StObject.set(x, "tabClick", value.asInstanceOf[js.Any])
  }
}
