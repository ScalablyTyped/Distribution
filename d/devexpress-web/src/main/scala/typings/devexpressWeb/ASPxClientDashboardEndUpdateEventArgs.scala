package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardEndUpdate event.
  */
@js.native
trait ASPxClientDashboardEndUpdateEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the identifier of the dashboard for which the event was raised.
    */
  var DashboardId: String = js.native
}
object ASPxClientDashboardEndUpdateEventArgs {
  
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardEndUpdateEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardEndUpdateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardEndUpdateEventArgsMutableBuilder[Self <: ASPxClientDashboardEndUpdateEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardId(value: String): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
  }
}
