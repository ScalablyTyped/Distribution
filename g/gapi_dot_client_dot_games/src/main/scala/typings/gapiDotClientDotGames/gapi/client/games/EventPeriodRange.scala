package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPeriodRange extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventPeriodRange. */
  var kind: js.UndefOr[String] = js.undefined
  /** The time when this update period ends, in millis, since 1970 UTC (Unix Epoch). */
  var periodEndMillis: js.UndefOr[String] = js.undefined
  /** The time when this update period begins, in millis, since 1970 UTC (Unix Epoch). */
  var periodStartMillis: js.UndefOr[String] = js.undefined
}

object EventPeriodRange {
  @scala.inline
  def apply(kind: String = null, periodEndMillis: String = null, periodStartMillis: String = null): EventPeriodRange = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (periodEndMillis != null) __obj.updateDynamic("periodEndMillis")(periodEndMillis.asInstanceOf[js.Any])
    if (periodStartMillis != null) __obj.updateDynamic("periodStartMillis")(periodStartMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPeriodRange]
  }
}

