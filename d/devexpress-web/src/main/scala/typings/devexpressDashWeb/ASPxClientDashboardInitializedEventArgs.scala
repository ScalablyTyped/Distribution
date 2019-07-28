package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDashboardInitializedEventArgs extends ASPxClientEventArgs {
  var DashboardId: String
}

object ASPxClientDashboardInitializedEventArgs {
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardInitializedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId)
  
    __obj.asInstanceOf[ASPxClientDashboardInitializedEventArgs]
  }
}

