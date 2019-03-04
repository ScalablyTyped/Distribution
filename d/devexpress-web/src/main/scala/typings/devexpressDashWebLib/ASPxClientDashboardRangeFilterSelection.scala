package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range in the Range Filter dashboard item.
  */
trait ASPxClientDashboardRangeFilterSelection extends js.Object {
  /**
    * Gets or sets a maximum value in the range of the Range Filter dashboard item.
    * Value: A maximum value in the range of the Range Filter dashboard item.
    */
  var Maximum: js.Object
  /**
    * Gets or sets a minimum value in the range of the Range Filter dashboard item.
    * Value: A minimum value in the range of the Range Filter dashboard item.
    */
  var Minimum: js.Object
}

object ASPxClientDashboardRangeFilterSelection {
  @scala.inline
  def apply(Maximum: js.Object, Minimum: js.Object): ASPxClientDashboardRangeFilterSelection = {
    val __obj = js.Dynamic.literal(Maximum = Maximum, Minimum = Minimum)
  
    __obj.asInstanceOf[ASPxClientDashboardRangeFilterSelection]
  }
}

