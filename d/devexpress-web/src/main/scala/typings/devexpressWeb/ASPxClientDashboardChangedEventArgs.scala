package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardChanged event.
  */
@js.native
trait ASPxClientDashboardChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the identifier of a newly opened dashboard.
    */
  var DashboardId: String = js.native
}
object ASPxClientDashboardChangedEventArgs {
  
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardChangedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardChangedEventArgsMutableBuilder[Self <: ASPxClientDashboardChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardId(value: String): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
  }
}
