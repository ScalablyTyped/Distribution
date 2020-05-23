package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardInitialized event.
  */
trait ASPxClientDashboardInitializedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the dashboard's unique name.
    */
  var DashboardId: String
}

object ASPxClientDashboardInitializedEventArgs {
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardInitializedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardInitializedEventArgs]
  }
}

