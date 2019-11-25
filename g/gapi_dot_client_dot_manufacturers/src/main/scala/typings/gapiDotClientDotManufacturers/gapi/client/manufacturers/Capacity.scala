package typings.gapiDotClientDotManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capacity extends js.Object {
  /** The unit of the capacity, i.e., MB, GB, or TB. */
  var unit: js.UndefOr[String] = js.undefined
  /** The numeric value of the capacity. */
  var value: js.UndefOr[String] = js.undefined
}

object Capacity {
  @scala.inline
  def apply(unit: String = null, value: String = null): Capacity = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capacity]
  }
}

