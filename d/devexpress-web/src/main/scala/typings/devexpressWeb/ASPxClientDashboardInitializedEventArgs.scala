package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardInitialized event.
  */
trait ASPxClientDashboardInitializedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the dashboard's unique name.
    */
  var DashboardId: String
}
object ASPxClientDashboardInitializedEventArgs {
  
  inline def apply(DashboardId: String): ASPxClientDashboardInitializedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardInitializedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardInitializedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setDashboardId(value: String): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
  }
}
