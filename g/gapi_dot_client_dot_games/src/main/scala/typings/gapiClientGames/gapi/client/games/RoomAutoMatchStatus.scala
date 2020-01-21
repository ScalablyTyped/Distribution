package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomAutoMatchStatus extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomAutoMatchStatus. */
  var kind: js.UndefOr[String] = js.undefined
  /** An estimate for the amount of time (in seconds) that auto-matching is expected to take to complete. */
  var waitEstimateSeconds: js.UndefOr[Double] = js.undefined
}

object RoomAutoMatchStatus {
  @scala.inline
  def apply(kind: String = null, waitEstimateSeconds: Int | Double = null): RoomAutoMatchStatus = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (waitEstimateSeconds != null) __obj.updateDynamic("waitEstimateSeconds")(waitEstimateSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomAutoMatchStatus]
  }
}

