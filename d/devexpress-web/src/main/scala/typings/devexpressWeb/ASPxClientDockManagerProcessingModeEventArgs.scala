package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.AfterDock event.
  */
@js.native
trait ASPxClientDockManagerProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
  
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone = js.native
}
object ASPxClientDockManagerProcessingModeEventArgs {
  
  @scala.inline
  def apply(panel: ASPxClientDockPanel, processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockManagerProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDockManagerProcessingModeEventArgsOps[Self <: ASPxClientDockManagerProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPanel(value: ASPxClientDockPanel): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZone(value: ASPxClientDockZone): Self = this.set("zone", value.asInstanceOf[js.Any])
  }
}
