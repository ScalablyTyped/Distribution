package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardEndUpdate event.
  */
@js.native
trait ASPxClientDashboardEndUpdateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the identifier of the dashboard for which the event was raised.
    */
  var DashboardId: String = js.native
}

object ASPxClientDashboardEndUpdateEventArgs {
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardEndUpdateEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardEndUpdateEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardEndUpdateEventArgsOps[Self <: ASPxClientDashboardEndUpdateEventArgs] (val x: Self) extends AnyVal {
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

