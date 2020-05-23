package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to client widgets used to visualize data in dashboard items.
  */
trait ASPxClientDashboardItemWidgetEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String
  /**
    * Returns an underlying widget corresponding to the current dashboard item.
    */
  def GetWidget(): js.Any
}

object ASPxClientDashboardItemWidgetEventArgs {
  @scala.inline
  def apply(GetWidget: () => js.Any, ItemName: String): ASPxClientDashboardItemWidgetEventArgs = {
    val __obj = js.Dynamic.literal(GetWidget = js.Any.fromFunction0(GetWidget), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemWidgetEventArgs]
  }
}

