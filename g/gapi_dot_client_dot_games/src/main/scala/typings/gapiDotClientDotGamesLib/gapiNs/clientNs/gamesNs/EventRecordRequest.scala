package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRecordRequest extends js.Object {
  /** The current time when this update was sent, in milliseconds, since 1970 UTC (Unix Epoch). */
  var currentTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventRecordRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The request ID used to identify this attempt to record events. */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of the time period updates being made in this request. */
  var timePeriods: js.UndefOr[js.Array[EventPeriodUpdate]] = js.undefined
}

