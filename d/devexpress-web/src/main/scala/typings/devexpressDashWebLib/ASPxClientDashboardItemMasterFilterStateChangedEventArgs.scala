package typings
package devexpressDashWebLib

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
    IsNullValue: js.Function1[js.Object, scala.Boolean],
    IsOthersValue: js.Function1[js.Object, scala.Boolean],
    ItemName: java.lang.String,
    Values: js.Array[js.Array[js.Object]]
  ): ASPxClientDashboardItemMasterFilterStateChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsNullValue")(IsNullValue)
    __obj.updateDynamic("IsOthersValue")(IsOthersValue)
    __obj.updateDynamic("ItemName")(ItemName)
    __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[ASPxClientDashboardItemMasterFilterStateChangedEventArgs]
  }
}

