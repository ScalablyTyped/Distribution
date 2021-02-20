package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockZone.AfterDock event.
  */
@js.native
trait ASPxClientDockZoneProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}
object ASPxClientDockZoneProcessingModeEventArgs {
  
  @scala.inline
  def apply(panel: ASPxClientDockPanel, processOnServer: Boolean): ASPxClientDockZoneProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockZoneProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDockZoneProcessingModeEventArgsMutableBuilder[Self <: ASPxClientDockZoneProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanel(value: ASPxClientDockPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
  }
}
