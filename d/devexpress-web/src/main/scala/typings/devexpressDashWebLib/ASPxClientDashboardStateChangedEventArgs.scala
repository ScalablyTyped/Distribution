package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DashboardStateChanged event.
  */
trait ASPxClientDashboardStateChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the current state of the dashboard.
    * Value: A string value that is the current state of the dashboard.
    */
  var DashboardState: java.lang.String
}

object ASPxClientDashboardStateChangedEventArgs {
  @scala.inline
  def apply(DashboardState: java.lang.String): ASPxClientDashboardStateChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DashboardState")(DashboardState)
    __obj.asInstanceOf[ASPxClientDashboardStateChangedEventArgs]
  }
}

