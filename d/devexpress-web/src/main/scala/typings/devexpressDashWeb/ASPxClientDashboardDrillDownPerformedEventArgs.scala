package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DrillDownPerformed event.
  */
trait ASPxClientDashboardDrillDownPerformedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the dashboard item.
    * Value: A string that specifies the name of the dashboard item.
    */
  var ItemName: String
  /**
    * Gets values from the current drill-down hierarchy.
    * Value: An array of values from the current drill-down hierarchy.
    */
  var Values: js.Array[js.Object]
  /**
    * Returns whether or not the specified value is NullValue.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Object): Boolean
  /**
    * Returns whether or not the specified value is OthersValue.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Object): Boolean
}

object ASPxClientDashboardDrillDownPerformedEventArgs {
  @scala.inline
  def apply(
    IsNullValue: js.Object => Boolean,
    IsOthersValue: js.Object => Boolean,
    ItemName: String,
    Values: js.Array[js.Object]
  ): ASPxClientDashboardDrillDownPerformedEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName, Values = Values)
  
    __obj.asInstanceOf[ASPxClientDashboardDrillDownPerformedEventArgs]
  }
}

