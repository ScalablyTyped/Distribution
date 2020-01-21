package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to client widgets used to visualize data in dashboard items.
  */
@JSGlobal("ASPxClientDashboardItemWidgetEventArgs")
@js.native
class ASPxClientDashboardItemWidgetEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  /**
    * Returns an underlying widget corresponding to the current dashboard item.
    */
  def GetWidget(): js.Any = js.native
}

