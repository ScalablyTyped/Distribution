package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomP2PStatuses extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomP2PStatuses. */
  var kind: js.UndefOr[String] = js.native
  /** The updates for the peers. */
  var updates: js.UndefOr[js.Array[RoomP2PStatus]] = js.native
}

object RoomP2PStatuses {
  @scala.inline
  def apply(): RoomP2PStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomP2PStatuses]
  }
  @scala.inline
  implicit class RoomP2PStatusesOps[Self <: RoomP2PStatuses] (val x: Self) extends AnyVal {
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
    def setUpdatesVarargs(value: RoomP2PStatus*): Self = this.set("updates", js.Array(value :_*))
    @scala.inline
    def setUpdates(value: js.Array[RoomP2PStatus]): Self = this.set("updates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
  
}

