package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flight extends js.Object {
  /** Inventory item flight end date. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** Rate or cost of this flight. */
  var rateOrCost: js.UndefOr[java.lang.String] = js.undefined
  /** Inventory item flight start date. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** Units of this flight. */
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object Flight {
  @scala.inline
  def apply(
    endDate: java.lang.String = null,
    rateOrCost: java.lang.String = null,
    startDate: java.lang.String = null,
    units: java.lang.String = null
  ): Flight = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (rateOrCost != null) __obj.updateDynamic("rateOrCost")(rateOrCost)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[Flight]
  }
}

