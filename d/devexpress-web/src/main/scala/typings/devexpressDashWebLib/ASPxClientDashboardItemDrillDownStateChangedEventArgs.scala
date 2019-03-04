package typings
package devexpressDashWebLib

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
  var Action: java.lang.String
  /**
    * Gets values from the current drill-down hierarchy.
    * Value: An array of values from the current drill-down hierarchy.
    */
  var Values: js.Array[js.Object]
}

object ASPxClientDashboardItemDrillDownStateChangedEventArgs {
  @scala.inline
  def apply(
    Action: java.lang.String,
    IsNullValue: js.Function1[js.Object, scala.Boolean],
    IsOthersValue: js.Function1[js.Object, scala.Boolean],
    ItemName: java.lang.String,
    Values: js.Array[js.Object]
  ): ASPxClientDashboardItemDrillDownStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(Action = Action, IsNullValue = IsNullValue, IsOthersValue = IsOthersValue, ItemName = ItemName, Values = Values)
  
    __obj.asInstanceOf[ASPxClientDashboardItemDrillDownStateChangedEventArgs]
  }
}

