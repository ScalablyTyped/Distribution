package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a leave room request.
  */
@js.native
trait Schema$RoomLeaveRequest extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomLeaveRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Diagnostics for a player leaving the room.
    */
  var leaveDiagnostics: js.UndefOr[Schema$RoomLeaveDiagnostics] = js.native
  /**
    * Reason for leaving the match. Possible values are:   -
    * &quot;PLAYER_LEFT&quot; - The player chose to leave the room..  -
    * &quot;GAME_LEFT&quot; - The game chose to remove the player from the
    * room.  - &quot;REALTIME_ABANDONED&quot; - The player switched to another
    * application and abandoned the room.  -
    * &quot;REALTIME_PEER_CONNECTION_FAILURE&quot; - The client was unable to
    * establish a connection to other peer(s).  -
    * &quot;REALTIME_SERVER_CONNECTION_FAILURE&quot; - The client was unable to
    * communicate with the server.  - &quot;REALTIME_SERVER_ERROR&quot; - The
    * client received an error response when it tried to communicate with the
    * server.  - &quot;REALTIME_TIMEOUT&quot; - The client timed out while
    * waiting for a room.  - &quot;REALTIME_CLIENT_DISCONNECTING&quot; - The
    * client disconnects without first calling Leave.  -
    * &quot;REALTIME_SIGN_OUT&quot; - The user signed out of G+ while in the
    * room.  - &quot;REALTIME_GAME_CRASHED&quot; - The game crashed.  -
    * &quot;REALTIME_ROOM_SERVICE_CRASHED&quot; - RoomAndroidService crashed.
    * - &quot;REALTIME_DIFFERENT_CLIENT_ROOM_OPERATION&quot; - Another client
    * is trying to enter a room.  -
    * &quot;REALTIME_SAME_CLIENT_ROOM_OPERATION&quot; - The same client is
    * trying to enter a new room.
    */
  var reason: js.UndefOr[String] = js.native
}

object Schema$RoomLeaveRequest {
  @scala.inline
  def apply(kind: String = null, leaveDiagnostics: Schema$RoomLeaveDiagnostics = null, reason: String = null): Schema$RoomLeaveRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leaveDiagnostics != null) __obj.updateDynamic("leaveDiagnostics")(leaveDiagnostics.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoomLeaveRequest]
  }
}

