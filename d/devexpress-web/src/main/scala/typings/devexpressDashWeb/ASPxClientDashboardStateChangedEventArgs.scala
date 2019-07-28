package typings.devexpressDashWeb

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
  var DashboardState: String
}

object ASPxClientDashboardStateChangedEventArgs {
  @scala.inline
  def apply(DashboardState: String): ASPxClientDashboardStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardState = DashboardState)
  
    __obj.asInstanceOf[ASPxClientDashboardStateChangedEventArgs]
  }
}

