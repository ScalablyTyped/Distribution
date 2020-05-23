package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardInitializing event.
  */
trait ASPxClientDashboardInitializingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a model of the dashboard displayed in the control.
    */
  var Dashboard: js.Any
  /**
    * Gets a string value that is the dashboard identifier.
    */
  var DashboardId: String
  /**
    * Specifies a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
    */
  var Ready: js.Any
}

object ASPxClientDashboardInitializingEventArgs {
  @scala.inline
  def apply(Dashboard: js.Any, DashboardId: String, Ready: js.Any): ASPxClientDashboardInitializingEventArgs = {
    val __obj = js.Dynamic.literal(Dashboard = Dashboard.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], Ready = Ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardInitializingEventArgs]
  }
}

