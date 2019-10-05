package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomStatus extends js.Object {
  /** Auto-matching status for this room. Not set if the room is not currently in the automatching queue. */
  var autoMatchingStatus: js.UndefOr[RoomAutoMatchStatus] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomStatus. */
  var kind: js.UndefOr[String] = js.undefined
  /** The participants involved in the room, along with their statuses. Includes participants who have left or declined invitations. */
  var participants: js.UndefOr[js.Array[RoomParticipant]] = js.undefined
  /** Globally unique ID for a room. */
  var roomId: js.UndefOr[String] = js.undefined
  /**
    * The status of the room.
    * Possible values are:
    * - "ROOM_INVITING" - One or more players have been invited and not responded.
    * - "ROOM_AUTO_MATCHING" - One or more slots need to be filled by auto-matching.
    * - "ROOM_CONNECTING" - Players have joined are connecting to each other (either before or after auto-matching).
    * - "ROOM_ACTIVE" - All players have joined and connected to each other.
    * - "ROOM_DELETED" - All joined players have left.
    */
  var status: js.UndefOr[String] = js.undefined
  /** The version of the status for the room: an increasing counter, used by the client to ignore out-of-order updates to room status. */
  var statusVersion: js.UndefOr[Double] = js.undefined
}

object RoomStatus {
  @scala.inline
  def apply(
    autoMatchingStatus: RoomAutoMatchStatus = null,
    kind: String = null,
    participants: js.Array[RoomParticipant] = null,
    roomId: String = null,
    status: String = null,
    statusVersion: Int | Double = null
  ): RoomStatus = {
    val __obj = js.Dynamic.literal()
    if (autoMatchingStatus != null) __obj.updateDynamic("autoMatchingStatus")(autoMatchingStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (participants != null) __obj.updateDynamic("participants")(participants)
    if (roomId != null) __obj.updateDynamic("roomId")(roomId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusVersion != null) __obj.updateDynamic("statusVersion")(statusVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomStatus]
  }
}

