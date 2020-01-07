package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Frequency cap.
  */
@js.native
trait Schema$FrequencyCap extends js.Object {
  /**
    * The maximum number of impressions that can be served to a user within the
    * specified time period.
    */
  var maxImpressions: js.UndefOr[Double] = js.native
  /**
    * The amount of time, in the units specified by time_unit_type. Defines the
    * amount of time over which impressions per user are counted and capped.
    */
  var numTimeUnits: js.UndefOr[Double] = js.native
  /**
    * The time unit. Along with num_time_units defines the amount of time over
    * which impressions per user are counted and capped.
    */
  var timeUnitType: js.UndefOr[String] = js.native
}

object Schema$FrequencyCap {
  @scala.inline
  def apply(
    maxImpressions: Int | Double = null,
    numTimeUnits: Int | Double = null,
    timeUnitType: String = null
  ): Schema$FrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (maxImpressions != null) __obj.updateDynamic("maxImpressions")(maxImpressions.asInstanceOf[js.Any])
    if (numTimeUnits != null) __obj.updateDynamic("numTimeUnits")(numTimeUnits.asInstanceOf[js.Any])
    if (timeUnitType != null) __obj.updateDynamic("timeUnitType")(timeUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FrequencyCap]
  }
}

