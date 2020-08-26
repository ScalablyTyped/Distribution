package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomAutoMatchStatus extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomAutoMatchStatus. */
  var kind: js.UndefOr[String] = js.native
  /** An estimate for the amount of time (in seconds) that auto-matching is expected to take to complete. */
  var waitEstimateSeconds: js.UndefOr[Double] = js.native
}

object RoomAutoMatchStatus {
  @scala.inline
  def apply(): RoomAutoMatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomAutoMatchStatus]
  }
  @scala.inline
  implicit class RoomAutoMatchStatusOps[Self <: RoomAutoMatchStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setWaitEstimateSeconds(value: Double): Self = this.set("waitEstimateSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitEstimateSeconds: Self = this.set("waitEstimateSeconds", js.undefined)
  }
  
}

