package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range in the Range Filter or Date Filter dashboard item.
  */
trait ASPxClientDashboardRangeFilterSelection extends js.Object {
  /**
    * Gets or sets a maximum value in the range of the Range Filter dashboard item.
    */
  var Maximum: js.Any
  /**
    * Gets or sets a minimum value in the range of the Range Filter dashboard item.
    */
  var Minimum: js.Any
}

object ASPxClientDashboardRangeFilterSelection {
  @scala.inline
  def apply(Maximum: js.Any, Minimum: js.Any): ASPxClientDashboardRangeFilterSelection = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardRangeFilterSelection]
  }
}

