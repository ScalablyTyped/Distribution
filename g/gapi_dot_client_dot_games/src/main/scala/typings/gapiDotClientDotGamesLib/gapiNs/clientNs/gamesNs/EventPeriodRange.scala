package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPeriodRange extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventPeriodRange. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The time when this update period ends, in millis, since 1970 UTC (Unix Epoch). */
  var periodEndMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The time when this update period begins, in millis, since 1970 UTC (Unix Epoch). */
  var periodStartMillis: js.UndefOr[java.lang.String] = js.undefined
}

object EventPeriodRange {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    periodEndMillis: java.lang.String = null,
    periodStartMillis: java.lang.String = null
  ): EventPeriodRange = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (periodEndMillis != null) __obj.updateDynamic("periodEndMillis")(periodEndMillis)
    if (periodStartMillis != null) __obj.updateDynamic("periodStartMillis")(periodStartMillis)
    __obj.asInstanceOf[EventPeriodRange]
  }
}

