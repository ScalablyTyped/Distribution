package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventPeriodUpdate extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventPeriodUpdate. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The time period being covered by this update. */
  var timePeriod: js.UndefOr[EventPeriodRange] = js.undefined
  /** The updates being made for this time period. */
  var updates: js.UndefOr[js.Array[EventUpdateRequest]] = js.undefined
}

