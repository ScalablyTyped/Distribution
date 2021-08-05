package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardChanged event.
  */
trait ASPxClientDashboardChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the identifier of a newly opened dashboard.
    */
  var DashboardId: String
}
object ASPxClientDashboardChangedEventArgs {
  
  inline def apply(DashboardId: String): ASPxClientDashboardChangedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardChangedEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardChangedEventArgs](x: Self) {
    
    inline def setDashboardId(value: String): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
  }
}
