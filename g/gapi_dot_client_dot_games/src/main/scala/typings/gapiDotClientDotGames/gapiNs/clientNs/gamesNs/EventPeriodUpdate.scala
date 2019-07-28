package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPeriodUpdate extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventPeriodUpdate. */
  var kind: js.UndefOr[String] = js.undefined
  /** The time period being covered by this update. */
  var timePeriod: js.UndefOr[EventPeriodRange] = js.undefined
  /** The updates being made for this time period. */
  var updates: js.UndefOr[js.Array[EventUpdateRequest]] = js.undefined
}

object EventPeriodUpdate {
  @scala.inline
  def apply(
    kind: String = null,
    timePeriod: EventPeriodRange = null,
    updates: js.Array[EventUpdateRequest] = null
  ): EventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (timePeriod != null) __obj.updateDynamic("timePeriod")(timePeriod)
    if (updates != null) __obj.updateDynamic("updates")(updates)
    __obj.asInstanceOf[EventPeriodUpdate]
  }
}

