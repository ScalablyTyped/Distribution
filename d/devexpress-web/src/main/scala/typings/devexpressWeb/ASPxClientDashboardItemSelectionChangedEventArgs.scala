package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemSelectionChanged event.
  */
trait ASPxClientDashboardItemSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String
  /**
    * Gets currently selected elements.
    */
  def GetCurrentSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple]
}

object ASPxClientDashboardItemSelectionChangedEventArgs {
  @scala.inline
  def apply(GetCurrentSelection: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple], ItemName: String): ASPxClientDashboardItemSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(GetCurrentSelection = js.Any.fromFunction0(GetCurrentSelection), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemSelectionChangedEventArgs]
  }
}

