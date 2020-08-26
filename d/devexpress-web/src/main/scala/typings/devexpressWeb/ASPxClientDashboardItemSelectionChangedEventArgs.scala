package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemSelectionChanged event.
  */
@js.native
trait ASPxClientDashboardItemSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  /**
    * Gets currently selected elements.
    */
  def GetCurrentSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
}

object ASPxClientDashboardItemSelectionChangedEventArgs {
  @scala.inline
  def apply(GetCurrentSelection: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple], ItemName: String): ASPxClientDashboardItemSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(GetCurrentSelection = js.Any.fromFunction0(GetCurrentSelection), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemSelectionChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemSelectionChangedEventArgsOps[Self <: ASPxClientDashboardItemSelectionChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setGetCurrentSelection(value: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple]): Self = this.set("GetCurrentSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setItemName(value: String): Self = this.set("ItemName", value.asInstanceOf[js.Any])
  }
  
}

