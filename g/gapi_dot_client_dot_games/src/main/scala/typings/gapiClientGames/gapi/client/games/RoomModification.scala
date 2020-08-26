package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomModification extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomModification. */
  var kind: js.UndefOr[String] = js.native
  /** The timestamp at which they modified the room, in milliseconds since the epoch in UTC. */
  var modifiedTimestampMillis: js.UndefOr[String] = js.native
  /** The ID of the participant that modified the room. */
  var participantId: js.UndefOr[String] = js.native
}

object RoomModification {
  @scala.inline
  def apply(): RoomModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomModification]
  }
  @scala.inline
  implicit class RoomModificationOps[Self <: RoomModification] (val x: Self) extends AnyVal {
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
    def setModifiedTimestampMillis(value: String): Self = this.set("modifiedTimestampMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedTimestampMillis: Self = this.set("modifiedTimestampMillis", js.undefined)
    @scala.inline
    def setParticipantId(value: String): Self = this.set("participantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipantId: Self = this.set("participantId", js.undefined)
  }
  
}

