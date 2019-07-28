package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActionAvailabilityChanged event.
  */
trait ASPxClientDashboardActionAvailabilityChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets whether or not data reloading is available in the current state of dashboard item.
    * Value: true, if data reloading is available in the current state of dashboard item; otherwise, false.
    */
  var IsReloadDataAvailable: Boolean
  /**
    * Gets interactivity actions currently available for the dashboard item.
    * Value: An array of ASPxClientDashboardItemAction objects that represent interactivity actions currently available for the dashboard item.
    */
  var ItemActions: js.Array[ASPxClientDashboardItemAction]
}

object ASPxClientDashboardActionAvailabilityChangedEventArgs {
  @scala.inline
  def apply(IsReloadDataAvailable: Boolean, ItemActions: js.Array[ASPxClientDashboardItemAction]): ASPxClientDashboardActionAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(IsReloadDataAvailable = IsReloadDataAvailable, ItemActions = ItemActions)
  
    __obj.asInstanceOf[ASPxClientDashboardActionAvailabilityChangedEventArgs]
  }
}

