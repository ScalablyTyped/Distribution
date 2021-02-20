package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockZone.BeforeDock event.
  */
@js.native
trait ASPxClientDockZoneCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}
object ASPxClientDockZoneCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, panel: ASPxClientDockPanel, processOnServer: Boolean): ASPxClientDockZoneCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockZoneCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDockZoneCancelEventArgsMutableBuilder[Self <: ASPxClientDockZoneCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanel(value: ASPxClientDockPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
  }
}
