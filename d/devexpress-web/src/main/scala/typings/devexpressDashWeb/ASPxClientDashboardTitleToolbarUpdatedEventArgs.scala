package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DashboardTitleToolbarUpdated event.
  */
trait ASPxClientDashboardTitleToolbarUpdatedEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to dashboard title options.
    * Value: A <a href="https://documentation.devexpress.com/ClientDashboard/api/DevExpress.Dashboard.DashboardTitleToolbarOptions.html">DashboardTitleToolbarOptions</a> object containing dashboard title options.
    */
  var Options: js.Object
}

object ASPxClientDashboardTitleToolbarUpdatedEventArgs {
  @scala.inline
  def apply(Options: js.Object): ASPxClientDashboardTitleToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(Options = Options)
  
    __obj.asInstanceOf[ASPxClientDashboardTitleToolbarUpdatedEventArgs]
  }
}

