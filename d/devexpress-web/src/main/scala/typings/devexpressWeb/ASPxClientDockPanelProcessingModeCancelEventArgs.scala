package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockPanel.BeforeDock event.
  */
trait ASPxClientDockPanelProcessingModeCancelEventArgs
  extends StObject
     with ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone
}
object ASPxClientDockPanelProcessingModeCancelEventArgs {
  
  inline def apply(cancel: Boolean, processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockPanelProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockPanelProcessingModeCancelEventArgs]
  }
  
  extension [Self <: ASPxClientDockPanelProcessingModeCancelEventArgs](x: Self) {
    
    inline def setZone(value: ASPxClientDockZone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
