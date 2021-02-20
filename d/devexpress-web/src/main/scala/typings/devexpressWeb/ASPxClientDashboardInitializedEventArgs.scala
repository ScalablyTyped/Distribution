package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardInitialized event.
  */
@js.native
trait ASPxClientDashboardInitializedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the dashboard's unique name.
    */
  var DashboardId: String = js.native
}
object ASPxClientDashboardInitializedEventArgs {
  
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardInitializedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardInitializedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardInitializedEventArgsMutableBuilder[Self <: ASPxClientDashboardInitializedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardId(value: String): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
  }
}
