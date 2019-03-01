package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomAutoMatchStatus extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomAutoMatchStatus. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** An estimate for the amount of time (in seconds) that auto-matching is expected to take to complete. */
  var waitEstimateSeconds: js.UndefOr[scala.Double] = js.undefined
}

object RoomAutoMatchStatus {
  @scala.inline
  def apply(kind: java.lang.String = null, waitEstimateSeconds: scala.Int | scala.Double = null): RoomAutoMatchStatus = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (waitEstimateSeconds != null) __obj.updateDynamic("waitEstimateSeconds")(waitEstimateSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomAutoMatchStatus]
  }
}

