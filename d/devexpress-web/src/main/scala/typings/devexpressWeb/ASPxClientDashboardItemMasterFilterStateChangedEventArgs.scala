package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemMasterFilterStateChanged event.
  */
@js.native
trait ASPxClientDashboardItemMasterFilterStateChangedEventArgs extends ASPxClientDashboardItemEventArgs {
  /**
    * Gets the currently selected values.
    */
  var Values: js.Array[js.Array[js.Object]] = js.native
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
  @scala.inline
  implicit class ASPxClientDashboardItemMasterFilterStateChangedEventArgsOps[Self <: ASPxClientDashboardItemMasterFilterStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Object]*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[js.Array[js.Object]]): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

