package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomParticipant extends js.Object {
  /** True if this participant was auto-matched with the requesting player. */
  var autoMatched: js.UndefOr[Boolean] = js.undefined
  /** Information about a player that has been anonymously auto-matched against the requesting player. (Either player or autoMatchedPlayer will be set.) */
  var autoMatchedPlayer: js.UndefOr[AnonymousPlayer] = js.undefined
  /** The capabilities which can be used when communicating with this participant. */
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  /** Client address for the participant. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.undefined
  /** True if this participant is in the fully connected set of peers in the room. */
  var connected: js.UndefOr[Boolean] = js.undefined
  /** An identifier for the participant in the scope of the room. Cannot be used to identify a player across rooms or in other contexts. */
  var id: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomParticipant. */
  var kind: js.UndefOr[String] = js.undefined
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
  var leaveReason: js.UndefOr[String] = js.undefined
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
  var status: js.UndefOr[String] = js.undefined
}

object RoomParticipant {
  @scala.inline
  def apply(
    autoMatched: js.UndefOr[Boolean] = js.undefined,
    autoMatchedPlayer: AnonymousPlayer = null,
    capabilities: js.Array[String] = null,
    clientAddress: RoomClientAddress = null,
    connected: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    leaveReason: String = null,
    player: Player = null,
    status: String = null
  ): RoomParticipant = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoMatched)) __obj.updateDynamic("autoMatched")(autoMatched)
    if (autoMatchedPlayer != null) __obj.updateDynamic("autoMatchedPlayer")(autoMatchedPlayer)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress)
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (leaveReason != null) __obj.updateDynamic("leaveReason")(leaveReason)
    if (player != null) __obj.updateDynamic("player")(player)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[RoomParticipant]
  }
}

