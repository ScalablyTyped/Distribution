package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemMasterFilterStateChanged event.
  */
trait ASPxClientDashboardItemMasterFilterStateChangedEventArgs extends ASPxClientDashboardItemEventArgs {
  /**
    * Gets the currently selected values.
    * Value: An array of objects that are the currently selected values.
    */
  var Values: js.Array[js.Array[js.Object]]
}

object ASPxClientDashboardItemMasterFilterStateChangedEventArgs {
  @scala.inline
  def apply(
    IsNullValue: js.Object => Boolean,
    IsOthersValue: js.Object => Boolean,
    ItemName: String,
    Values: js.Array[js.Array[js.Object]]
  ): ASPxClientDashboardItemMasterFilterStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName, Values = Values)
  
    __obj.asInstanceOf[ASPxClientDashboardItemMasterFilterStateChangedEventArgs]
  }
}

