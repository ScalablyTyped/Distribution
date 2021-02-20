package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardInitializing event.
  */
@js.native
trait ASPxClientDashboardInitializingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a model of the dashboard displayed in the control.
    */
  var Dashboard: js.Any = js.native
  
  /**
    * Gets a string value that is the dashboard identifier.
    */
  var DashboardId: String = js.native
  
  /**
    * Specifies a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
    */
  var Ready: js.Any = js.native
}
object ASPxClientDashboardInitializingEventArgs {
  
  @scala.inline
  def apply(Dashboard: js.Any, DashboardId: String, Ready: js.Any): ASPxClientDashboardInitializingEventArgs = {
    val __obj = js.Dynamic.literal(Dashboard = Dashboard.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], Ready = Ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardInitializingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardInitializingEventArgsMutableBuilder[Self <: ASPxClientDashboardInitializingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboard(value: js.Any): Self = StObject.set(x, "Dashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardId(value: String): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: js.Any): Self = StObject.set(x, "Ready", value.asInstanceOf[js.Any])
  }
}
