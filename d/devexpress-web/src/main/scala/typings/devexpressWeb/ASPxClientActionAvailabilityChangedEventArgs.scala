package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ActionAvailabilityChanged event.
  */
@js.native
trait ASPxClientActionAvailabilityChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String = js.native
}

object ASPxClientActionAvailabilityChangedEventArgs {
  @scala.inline
  def apply(ItemName: String): ASPxClientActionAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientActionAvailabilityChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientActionAvailabilityChangedEventArgsOps[Self <: ASPxClientActionAvailabilityChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setItemName(value: String): Self = this.set("ItemName", value.asInstanceOf[js.Any])
  }
  
}

