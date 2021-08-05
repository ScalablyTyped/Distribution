package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabControlTabCancelEventArgs
  extends StObject
     with ProcessingModeCancelEventArgs {
  
  var reloadContentOnCallback: Boolean
  
  val tab: BootstrapTab
}
object TabControlTabCancelEventArgs {
  
  inline def apply(
    cancel: Boolean,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    sender: Control,
    tab: BootstrapTab
  ): TabControlTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabControlTabCancelEventArgs]
  }
  
  extension [Self <: TabControlTabCancelEventArgs](x: Self) {
    
    inline def setReloadContentOnCallback(value: Boolean): Self = StObject.set(x, "reloadContentOnCallback", value.asInstanceOf[js.Any])
    
    inline def setTab(value: BootstrapTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
