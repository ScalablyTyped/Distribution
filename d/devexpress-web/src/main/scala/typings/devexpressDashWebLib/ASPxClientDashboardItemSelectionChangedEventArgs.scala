package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemSelectionChanged events.
  */
trait ASPxClientDashboardItemSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    * Value: A string that is the component name of the dashboard item.
    */
  var ItemName: java.lang.String
  /**
    * Gets currently selected elements.
    */
  def GetCurrentSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple]
}

object ASPxClientDashboardItemSelectionChangedEventArgs {
  @scala.inline
  def apply(
    GetCurrentSelection: js.Function0[js.Array[ASPxClientDashboardItemDataAxisPointTuple]],
    ItemName: java.lang.String
  ): ASPxClientDashboardItemSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetCurrentSelection")(GetCurrentSelection)
    __obj.updateDynamic("ItemName")(ItemName)
    __obj.asInstanceOf[ASPxClientDashboardItemSelectionChangedEventArgs]
  }
}

