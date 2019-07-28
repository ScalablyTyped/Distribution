package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flight extends js.Object {
  /** Inventory item flight end date. */
  var endDate: js.UndefOr[String] = js.undefined
  /** Rate or cost of this flight. */
  var rateOrCost: js.UndefOr[String] = js.undefined
  /** Inventory item flight start date. */
  var startDate: js.UndefOr[String] = js.undefined
  /** Units of this flight. */
  var units: js.UndefOr[String] = js.undefined
}

object Flight {
  @scala.inline
  def apply(endDate: String = null, rateOrCost: String = null, startDate: String = null, units: String = null): Flight = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (rateOrCost != null) __obj.updateDynamic("rateOrCost")(rateOrCost)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[Flight]
  }
}

