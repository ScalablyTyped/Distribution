package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
trait ASPxClientDockManagerProcessingModeCancelEventArgs
  extends StObject
     with ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel
  
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone
}
object ASPxClientDockManagerProcessingModeCancelEventArgs {
  
  inline def apply(cancel: Boolean, panel: ASPxClientDockPanel, processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockManagerProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerProcessingModeCancelEventArgs]
  }
  
  extension [Self <: ASPxClientDockManagerProcessingModeCancelEventArgs](x: Self) {
    
    inline def setPanel(value: ASPxClientDockPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setZone(value: ASPxClientDockZone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
