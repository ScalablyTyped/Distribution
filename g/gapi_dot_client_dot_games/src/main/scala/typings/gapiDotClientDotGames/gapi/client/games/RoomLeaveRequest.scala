package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomLeaveRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomLeaveRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** Diagnostics for a player leaving the room. */
  var leaveDiagnostics: js.UndefOr[RoomLeaveDiagnostics] = js.undefined
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
  var reason: js.UndefOr[String] = js.undefined
}

object RoomLeaveRequest {
  @scala.inline
  def apply(kind: String = null, leaveDiagnostics: RoomLeaveDiagnostics = null, reason: String = null): RoomLeaveRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (leaveDiagnostics != null) __obj.updateDynamic("leaveDiagnostics")(leaveDiagnostics)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[RoomLeaveRequest]
  }
}

