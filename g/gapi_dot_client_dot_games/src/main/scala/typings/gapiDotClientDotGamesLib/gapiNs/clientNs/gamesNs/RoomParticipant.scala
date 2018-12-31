package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomParticipant extends js.Object {
  /** True if this participant was auto-matched with the requesting player. */
  var autoMatched: js.UndefOr[scala.Boolean] = js.undefined
  /** Information about a player that has been anonymously auto-matched against the requesting player. (Either player or autoMatchedPlayer will be set.) */
  var autoMatchedPlayer: js.UndefOr[AnonymousPlayer] = js.undefined
  /** The capabilities which can be used when communicating with this participant. */
  var capabilities: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Client address for the participant. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.undefined
  /** True if this participant is in the fully connected set of peers in the room. */
  var connected: js.UndefOr[scala.Boolean] = js.undefined
  /** An identifier for the participant in the scope of the room. Cannot be used to identify a player across rooms or in other contexts. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomParticipant. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The reason the participant left the room; populated if the participant status is PARTICIPANT_LEFT.
    * Possible values are:
    * - "PLAYER_LEFT" - The player explicitly chose to leave the room.
    * - "GAME_LEFT" - The game chose to remove the player from the room.
    * - "ABANDONED" - The player switched to another application and abandoned the room.
    * - "PEER_CONNECTION_FAILURE" - The client was unable to establish or maintain a connection to other peer(s) in the room.
    * - "SERVER_ERROR" - The client received an error response when it tried to communicate with the server.
    * - "TIMEOUT" - The client timed out while waiting for players to join and connect.
    * - "PRESENCE_FAILURE" - The client's XMPP connection ended abruptly.
    */
  var leaveReason: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Information about the player. Not populated if this player was anonymously auto-matched against the requesting player. (Either player or
    * autoMatchedPlayer will be set.)
    */
  var player: js.UndefOr[Player] = js.undefined
  /**
    * The status of the participant with respect to the room.
    * Possible values are:
    * - "PARTICIPANT_INVITED" - The participant has been invited to join the room, but has not yet responded.
    * - "PARTICIPANT_JOINED" - The participant has joined the room (either after creating it or accepting an invitation.)
    * - "PARTICIPANT_DECLINED" - The participant declined an invitation to join the room.
    * - "PARTICIPANT_LEFT" - The participant joined the room and then left it.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

