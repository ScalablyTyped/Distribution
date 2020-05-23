package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemDrillDownStateChanged event.
  */
trait ASPxClientDashboardItemDrillDownStateChangedEventArgs extends ASPxClientDashboardItemEventArgs {
  /**
    * Gets the drill-down action performed in the dashboard item.
    */
  var Action: String
  /**
    * Gets values from the current drill-down hierarchy.
    */
  var Values: js.Array[_]
}

object ASPxClientDashboardItemDrillDownStateChangedEventArgs {
  @scala.inline
  def apply(
    Action: String,
    IsNullValue: js.Any => Boolean,
    IsOthersValue: js.Any => Boolean,
    ItemName: String,
    Values: js.Array[_]
  ): ASPxClientDashboardItemDrillDownStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDrillDownStateChangedEventArgs]
  }
}

