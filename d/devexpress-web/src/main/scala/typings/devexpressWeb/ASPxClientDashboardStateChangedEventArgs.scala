package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardStateChanged event.
  */
@js.native
trait ASPxClientDashboardStateChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the current state of the dashboard.
    */
  var DashboardState: String = js.native
}
object ASPxClientDashboardStateChangedEventArgs {
  
  @scala.inline
  def apply(DashboardState: String): ASPxClientDashboardStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardState = DashboardState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardStateChangedEventArgsMutableBuilder[Self <: ASPxClientDashboardStateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardState(value: String): Self = StObject.set(x, "DashboardState", value.asInstanceOf[js.Any])
  }
}
