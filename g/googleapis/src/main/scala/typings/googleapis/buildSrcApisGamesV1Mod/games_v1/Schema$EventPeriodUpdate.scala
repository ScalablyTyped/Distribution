package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait Schema$EventPeriodUpdate extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventPeriodUpdate.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time period being covered by this update.
    */
  var timePeriod: js.UndefOr[Schema$EventPeriodRange] = js.native
  /**
    * The updates being made for this time period.
    */
  var updates: js.UndefOr[js.Array[Schema$EventUpdateRequest]] = js.native
}

object Schema$EventPeriodUpdate {
  @scala.inline
  def apply(
    kind: String = null,
    timePeriod: Schema$EventPeriodRange = null,
    updates: js.Array[Schema$EventUpdateRequest] = null
  ): Schema$EventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (timePeriod != null) __obj.updateDynamic("timePeriod")(timePeriod.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventPeriodUpdate]
  }
}

