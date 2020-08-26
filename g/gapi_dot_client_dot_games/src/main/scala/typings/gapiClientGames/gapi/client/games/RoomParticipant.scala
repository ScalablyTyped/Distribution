package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomParticipant extends js.Object {
  /** True if this participant was auto-matched with the requesting player. */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /** Information about a player that has been anonymously auto-matched against the requesting player. (Either player or autoMatchedPlayer will be set.) */
  var autoMatchedPlayer: js.UndefOr[AnonymousPlayer] = js.native
  /** The capabilities which can be used when communicating with this participant. */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /** Client address for the participant. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.native
  /** True if this participant is in the fully connected set of peers in the room. */
  var connected: js.UndefOr[Boolean] = js.native
  /** An identifier for the participant in the scope of the room. Cannot be used to identify a player across rooms or in other contexts. */
  var id: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomParticipant. */
  var kind: js.UndefOr[String] = js.native
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
  var leaveReason: js.UndefOr[String] = js.native
  /**
    * Information about the player. Not populated if this player was anonymously auto-matched against the requesting player. (Either player or
    * autoMatchedPlayer will be set.)
    */
  var player: js.UndefOr[Player] = js.native
  /**
    * The status of the participant with respect to the room.
    * Possible values are:
    * - "PARTICIPANT_INVITED" - The participant has been invited to join the room, but has not yet responded.
    * - "PARTICIPANT_JOINED" - The participant has joined the room (either after creating it or accepting an invitation.)
    * - "PARTICIPANT_DECLINED" - The participant declined an invitation to join the room.
    * - "PARTICIPANT_LEFT" - The participant joined the room and then left it.
    */
  var status: js.UndefOr[String] = js.native
}

object RoomParticipant {
  @scala.inline
  def apply(): RoomParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomParticipant]
  }
  @scala.inline
  implicit class RoomParticipantOps[Self <: RoomParticipant] (val x: Self) extends AnyVal {
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
    def setAutoMatched(value: Boolean): Self = this.set("autoMatched", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMatched: Self = this.set("autoMatched", js.undefined)
    @scala.inline
    def setAutoMatchedPlayer(value: AnonymousPlayer): Self = this.set("autoMatchedPlayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMatchedPlayer: Self = this.set("autoMatchedPlayer", js.undefined)
    @scala.inline
    def setCapabilitiesVarargs(value: String*): Self = this.set("capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    @scala.inline
    def setClientAddress(value: RoomClientAddress): Self = this.set("clientAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAddress: Self = this.set("clientAddress", js.undefined)
    @scala.inline
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnected: Self = this.set("connected", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLeaveReason(value: String): Self = this.set("leaveReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaveReason: Self = this.set("leaveReason", js.undefined)
    @scala.inline
    def setPlayer(value: Player): Self = this.set("player", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

