package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flight
  */
@js.native
trait Schema$Flight extends js.Object {
  /**
    * Inventory item flight end date.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Rate or cost of this flight.
    */
  var rateOrCost: js.UndefOr[String] = js.native
  /**
    * Inventory item flight start date.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Units of this flight.
    */
  var units: js.UndefOr[String] = js.native
}

object Schema$Flight {
  @scala.inline
  def apply(endDate: String = null, rateOrCost: String = null, startDate: String = null, units: String = null): Schema$Flight = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (rateOrCost != null) __obj.updateDynamic("rateOrCost")(rateOrCost.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Flight]
  }
}

