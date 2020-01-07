package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for status of room automatching that is in
  * progress.
  */
@js.native
trait Schema$RoomAutoMatchStatus extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomAutoMatchStatus.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An estimate for the amount of time (in seconds) that auto-matching is
    * expected to take to complete.
    */
  var waitEstimateSeconds: js.UndefOr[Double] = js.native
}

object Schema$RoomAutoMatchStatus {
  @scala.inline
  def apply(kind: String = null, waitEstimateSeconds: Int | Double = null): Schema$RoomAutoMatchStatus = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (waitEstimateSeconds != null) __obj.updateDynamic("waitEstimateSeconds")(waitEstimateSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoomAutoMatchStatus]
  }
}

