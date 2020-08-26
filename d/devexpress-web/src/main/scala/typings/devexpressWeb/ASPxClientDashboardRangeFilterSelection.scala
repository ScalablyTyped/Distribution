package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range in the Range Filter or Date Filter dashboard item.
  */
@js.native
trait ASPxClientDashboardRangeFilterSelection extends js.Object {
  /**
    * Gets or sets a maximum value in the range of the Range Filter dashboard item.
    */
  var Maximum: js.Any = js.native
  /**
    * Gets or sets a minimum value in the range of the Range Filter dashboard item.
    */
  var Minimum: js.Any = js.native
}

object ASPxClientDashboardRangeFilterSelection {
  @scala.inline
  def apply(Maximum: js.Any, Minimum: js.Any): ASPxClientDashboardRangeFilterSelection = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardRangeFilterSelection]
  }
  @scala.inline
  implicit class ASPxClientDashboardRangeFilterSelectionOps[Self <: ASPxClientDashboardRangeFilterSelection] (val x: Self) extends AnyVal {
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
    def setMaximum(value: js.Any): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimum(value: js.Any): Self = this.set("Minimum", value.asInstanceOf[js.Any])
  }
  
}

