package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRecordRequest extends js.Object {
  /** The current time when this update was sent, in milliseconds, since 1970 UTC (Unix Epoch). */
  var currentTimeMillis: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventRecordRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** The request ID used to identify this attempt to record events. */
  var requestId: js.UndefOr[String] = js.undefined
  /** A list of the time period updates being made in this request. */
  var timePeriods: js.UndefOr[js.Array[EventPeriodUpdate]] = js.undefined
}

object EventRecordRequest {
  @scala.inline
  def apply(
    currentTimeMillis: String = null,
    kind: String = null,
    requestId: String = null,
    timePeriods: js.Array[EventPeriodUpdate] = null
  ): EventRecordRequest = {
    val __obj = js.Dynamic.literal()
    if (currentTimeMillis != null) __obj.updateDynamic("currentTimeMillis")(currentTimeMillis)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    if (timePeriods != null) __obj.updateDynamic("timePeriods")(timePeriods)
    __obj.asInstanceOf[EventRecordRequest]
  }
}

