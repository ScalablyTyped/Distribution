package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemSelectionChanged event.
  */
@JSGlobal("ASPxClientDashboardItemSelectionChangedEventArgs")
@js.native
class ASPxClientDashboardItemSelectionChangedEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  /**
    * Gets currently selected elements.
    */
  def GetCurrentSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
}

