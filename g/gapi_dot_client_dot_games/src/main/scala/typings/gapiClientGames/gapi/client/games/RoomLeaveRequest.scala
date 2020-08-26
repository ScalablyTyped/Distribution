package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomLeaveRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomLeaveRequest. */
  var kind: js.UndefOr[String] = js.native
  /** Diagnostics for a player leaving the room. */
  var leaveDiagnostics: js.UndefOr[RoomLeaveDiagnostics] = js.native
  /**
    * Reason for leaving the match.
    * Possible values are:
    * - "PLAYER_LEFT" - The player chose to leave the room..
    * - "GAME_LEFT" - The game chose to remove the player from the room.
    * - "REALTIME_ABANDONED" - The player switched to another application and abandoned the room.
    * - "REALTIME_PEER_CONNECTION_FAILURE" - The client was unable to establish a connection to other peer(s).
    * - "REALTIME_SERVER_CONNECTION_FAILURE" - The client was unable to communicate with the server.
    * - "REALTIME_SERVER_ERROR" - The client received an error response when it tried to communicate with the server.
    * - "REALTIME_TIMEOUT" - The client timed out while waiting for a room.
    * - "REALTIME_CLIENT_DISCONNECTING" - The client disconnects without first calling Leave.
    * - "REALTIME_SIGN_OUT" - The user signed out of G+ while in the room.
    * - "REALTIME_GAME_CRASHED" - The game crashed.
    * - "REALTIME_ROOM_SERVICE_CRASHED" - RoomAndroidService crashed.
    * - "REALTIME_DIFFERENT_CLIENT_ROOM_OPERATION" - Another client is trying to enter a room.
    * - "REALTIME_SAME_CLIENT_ROOM_OPERATION" - The same client is trying to enter a new room.
    */
  var reason: js.UndefOr[String] = js.native
}

object RoomLeaveRequest {
  @scala.inline
  def apply(): RoomLeaveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomLeaveRequest]
  }
  @scala.inline
  implicit class RoomLeaveRequestOps[Self <: RoomLeaveRequest] (val x: Self) extends AnyVal {
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
    def setLeaveDiagnostics(value: RoomLeaveDiagnostics): Self = this.set("leaveDiagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaveDiagnostics: Self = this.set("leaveDiagnostics", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

