package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@js.native
trait ASPxClientDockManagerCancelEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}
object ASPxClientDockManagerCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, panel: ASPxClientDockPanel): ASPxClientDockManagerCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDockManagerCancelEventArgsMutableBuilder[Self <: ASPxClientDockManagerCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanel(value: ASPxClientDockPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
  }
}
