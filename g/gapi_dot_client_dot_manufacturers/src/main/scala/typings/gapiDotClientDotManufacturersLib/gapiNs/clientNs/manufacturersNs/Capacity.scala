package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capacity extends js.Object {
  /** The unit of the capacity, i.e., MB, GB, or TB. */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /** The numeric value of the capacity. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Capacity {
  @scala.inline
  def apply(unit: java.lang.String = null, value: java.lang.String = null): Capacity = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Capacity]
  }
}

