package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientDashboardStateChangedEventArgsOps[Self <: ASPxClientDashboardStateChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setDashboardState(value: String): Self = this.set("DashboardState", value.asInstanceOf[js.Any])
  }
  
}

