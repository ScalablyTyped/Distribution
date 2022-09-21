package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardInitializing event.
  */
trait ASPxClientDashboardInitializingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a model of the dashboard displayed in the control.
    */
  var Dashboard: Any
  
  /**
    * Gets a string value that is the dashboard identifier.
    */
  var DashboardId: String
  
  /**
    * Specifies a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
    */
  var Ready: Any
}
object ASPxClientDashboardInitializingEventArgs {
  
  inline def apply(Dashboard: Any, DashboardId: String, Ready: Any): ASPxClientDashboardInitializingEventArgs = {
    val __obj = js.Dynamic.literal(Dashboard = Dashboard.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], Ready = Ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardInitializingEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardInitializingEventArgs](x: Self) {
    
    inline def setDashboard(value: Any): Self = StObject.set(x, "Dashboard", value.asInstanceOf[js.Any])
    
    inline def setDashboardId(value: String): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setReady(value: Any): Self = StObject.set(x, "Ready", value.asInstanceOf[js.Any])
  }
}
