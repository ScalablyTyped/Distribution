package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockPanel.AfterFloat event.
  */
@js.native
trait ASPxClientDockPanelProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone = js.native
}
object ASPxClientDockPanelProcessingModeEventArgs {
  
  @scala.inline
  def apply(processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockPanelProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockPanelProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDockPanelProcessingModeEventArgsMutableBuilder[Self <: ASPxClientDockPanelProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZone(value: ASPxClientDockZone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
