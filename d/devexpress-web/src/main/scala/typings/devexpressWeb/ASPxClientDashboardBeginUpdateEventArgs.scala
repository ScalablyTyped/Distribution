package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardBeginUpdate event.
  */
trait ASPxClientDashboardBeginUpdateEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the identifier of the dashboard for which the event was raised.
    */
  var DashboardId: String
}
object ASPxClientDashboardBeginUpdateEventArgs {
  
  inline def apply(DashboardId: String): ASPxClientDashboardBeginUpdateEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardBeginUpdateEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardBeginUpdateEventArgs](x: Self) {
    
    inline def setDashboardId(value: String): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
  }
}
