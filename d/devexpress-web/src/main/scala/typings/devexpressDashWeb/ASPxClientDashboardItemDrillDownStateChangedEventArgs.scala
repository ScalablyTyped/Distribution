package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemDrillDownStateChanged event.
  */
trait ASPxClientDashboardItemDrillDownStateChangedEventArgs extends ASPxClientDashboardItemEventArgs {
  /**
    * Gets the drill-down action performed in the dashboard item.
    * Value: A string value that is the drill-down action performed in the dashboard item.
    */
  var Action: String
  /**
    * Gets values from the current drill-down hierarchy.
    * Value: An array of values from the current drill-down hierarchy.
    */
  var Values: js.Array[js.Object]
}

object ASPxClientDashboardItemDrillDownStateChangedEventArgs {
  @scala.inline
  def apply(
    Action: String,
    IsNullValue: js.Object => Boolean,
    IsOthersValue: js.Object => Boolean,
    ItemName: String,
    Values: js.Array[js.Object]
  ): ASPxClientDashboardItemDrillDownStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(Action = Action, IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName, Values = Values)
  
    __obj.asInstanceOf[ASPxClientDashboardItemDrillDownStateChangedEventArgs]
  }
}

