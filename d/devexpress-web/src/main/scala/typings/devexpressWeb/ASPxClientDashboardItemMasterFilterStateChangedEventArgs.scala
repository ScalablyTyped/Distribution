package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemMasterFilterStateChanged event.
  */
trait ASPxClientDashboardItemMasterFilterStateChangedEventArgs extends ASPxClientDashboardItemEventArgs {
  /**
    * Gets the currently selected values.
    */
  var Values: js.Array[js.Array[js.Object]]
}

object ASPxClientDashboardItemMasterFilterStateChangedEventArgs {
  @scala.inline
  def apply(
    IsNullValue: js.Any => Boolean,
    IsOthersValue: js.Any => Boolean,
    ItemName: String,
    Values: js.Array[js.Array[js.Object]]
  ): ASPxClientDashboardItemMasterFilterStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemMasterFilterStateChangedEventArgs]
  }
}

