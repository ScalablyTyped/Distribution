package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardTitleToolbarUpdated event.
  */
trait ASPxClientDashboardTitleToolbarUpdatedEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to dashboard title options.
    */
  var Options: js.Any
}

object ASPxClientDashboardTitleToolbarUpdatedEventArgs {
  @scala.inline
  def apply(Options: js.Any): ASPxClientDashboardTitleToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardTitleToolbarUpdatedEventArgs]
  }
}

