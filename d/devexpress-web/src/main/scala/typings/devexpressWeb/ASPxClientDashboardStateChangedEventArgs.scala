package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardStateChanged event.
  */
trait ASPxClientDashboardStateChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the current state of the dashboard.
    */
  var DashboardState: String
}
object ASPxClientDashboardStateChangedEventArgs {
  
  inline def apply(DashboardState: String): ASPxClientDashboardStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardState = DashboardState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardStateChangedEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardStateChangedEventArgs](x: Self) {
    
    inline def setDashboardState(value: String): Self = StObject.set(x, "DashboardState", value.asInstanceOf[js.Any])
  }
}
