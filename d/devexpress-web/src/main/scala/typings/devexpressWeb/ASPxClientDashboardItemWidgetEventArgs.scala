package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to client widgets used to visualize data in dashboard items.
  */
@js.native
trait ASPxClientDashboardItemWidgetEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  /**
    * Returns an underlying widget corresponding to the current dashboard item.
    */
  def GetWidget(): js.Any = js.native
}

object ASPxClientDashboardItemWidgetEventArgs {
  @scala.inline
  def apply(GetWidget: () => js.Any, ItemName: String): ASPxClientDashboardItemWidgetEventArgs = {
    val __obj = js.Dynamic.literal(GetWidget = js.Any.fromFunction0(GetWidget), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemWidgetEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemWidgetEventArgsOps[Self <: ASPxClientDashboardItemWidgetEventArgs] (val x: Self) extends AnyVal {
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
    def setGetWidget(value: () => js.Any): Self = this.set("GetWidget", js.Any.fromFunction0(value))
    @scala.inline
    def setItemName(value: String): Self = this.set("ItemName", value.asInstanceOf[js.Any])
  }
  
}

