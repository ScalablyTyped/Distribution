package typings.devexpressWeb

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
  implicit class ASPxClientDashboardInitializedEventArgsOps[Self <: ASPxClientDashboardInitializedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDashboardId(value: String): Self = this.set("DashboardId", value.asInstanceOf[js.Any])
  }
}
