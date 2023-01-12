package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTabControlEventMap
  extends StObject
     with ControlEventMap {
  
  var activeTabChanged: TabControlTabEventArgs
  
  var activeTabChanging: TabControlTabCancelEventArgs
  
  var beginCallback: BeginCallbackEventArgs
  
  var callbackError: CallbackErrorEventArgs
  
  var endCallback: EndCallbackEventArgs
  
  var tabClick: TabControlTabClickEventArgs
}
object BootstrapTabControlEventMap {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: BootstrapTabControlEventMap] (val x: Self) extends AnyVal {
    
    inline def setActiveTabChanged(value: TabControlTabEventArgs): Self = StObject.set(x, "activeTabChanged", value.asInstanceOf[js.Any])
    
    inline def setActiveTabChanging(value: TabControlTabCancelEventArgs): Self = StObject.set(x, "activeTabChanging", value.asInstanceOf[js.Any])
    
    inline def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    inline def setTabClick(value: TabControlTabClickEventArgs): Self = StObject.set(x, "tabClick", value.asInstanceOf[js.Any])
  }
}
