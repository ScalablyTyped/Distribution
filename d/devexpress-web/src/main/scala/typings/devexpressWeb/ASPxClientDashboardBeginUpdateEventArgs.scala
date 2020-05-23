package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardBeginUpdate event.
  */
trait ASPxClientDashboardBeginUpdateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the identifier of the dashboard for which the event was raised.
    */
  var DashboardId: String
}

object ASPxClientDashboardBeginUpdateEventArgs {
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardBeginUpdateEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardBeginUpdateEventArgs]
  }
}

