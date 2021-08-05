package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
trait ASPxClientDockManagerCancelEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel
}
object ASPxClientDockManagerCancelEventArgs {
  
  inline def apply(cancel: Boolean, panel: ASPxClientDockPanel): ASPxClientDockManagerCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerCancelEventArgs]
  }
  
  extension [Self <: ASPxClientDockManagerCancelEventArgs](x: Self) {
    
    inline def setPanel(value: ASPxClientDockPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
  }
}
