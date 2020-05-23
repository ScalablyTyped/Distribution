package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardChanged event.
  */
trait ASPxClientDashboardChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the identifier of a newly opened dashboard.
    */
  var DashboardId: String
}

object ASPxClientDashboardChangedEventArgs {
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardChangedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardChangedEventArgs]
  }
}

