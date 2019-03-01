package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DashboardChanged event.
  */
trait ASPxClientDashboardChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the identifier of a newly opened dashboard.
    * Value: A string value that is an identifier of newly opened dashboard.
    */
  var DashboardId: java.lang.String
}

object ASPxClientDashboardChangedEventArgs {
  @scala.inline
  def apply(DashboardId: java.lang.String): ASPxClientDashboardChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DashboardId")(DashboardId)
    __obj.asInstanceOf[ASPxClientDashboardChangedEventArgs]
  }
}

