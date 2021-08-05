package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.AfterDock event.
  */
trait ASPxClientDockManagerProcessingModeEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel
  
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone
}
object ASPxClientDockManagerProcessingModeEventArgs {
  
  inline def apply(panel: ASPxClientDockPanel, processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockManagerProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerProcessingModeEventArgs]
  }
  
  extension [Self <: ASPxClientDockManagerProcessingModeEventArgs](x: Self) {
    
    inline def setPanel(value: ASPxClientDockPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setZone(value: ASPxClientDockZone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
