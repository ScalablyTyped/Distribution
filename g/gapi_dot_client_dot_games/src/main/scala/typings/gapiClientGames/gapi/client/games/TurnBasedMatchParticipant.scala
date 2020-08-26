package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedMatchParticipant extends js.Object {
  /** True if this participant was auto-matched with the requesting player. */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /** Information about a player that has been anonymously auto-matched against the requesting player. (Either player or autoMatchedPlayer will be set.) */
  var autoMatchedPlayer: js.UndefOr[AnonymousPlayer] = js.native
  /** An identifier for the participant in the scope of the match. Cannot be used to identify a player across matches or in other contexts. */
  var id: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchParticipant. */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the player. Not populated if this player was anonymously auto-matched against the requesting player. (Either player or
    * autoMatchedPlayer will be set.)
    */
  var player: js.UndefOr[Player] = js.native
  /**
    * The status of the participant with respect to the match.
    * Possible values are:
    * - "PARTICIPANT_NOT_INVITED_YET" - The participant is slated to be invited to the match, but the invitation has not been sent; the invite will be sent
    * when it becomes their turn.
    * - "PARTICIPANT_INVITED" - The participant has been invited to join the match, but has not yet responded.
    * - "PARTICIPANT_JOINED" - The participant has joined the match (either after creating it or accepting an invitation.)
    * - "PARTICIPANT_DECLINED" - The participant declined an invitation to join the match.
    * - "PARTICIPANT_LEFT" - The participant joined the match and then left it.
    * - "PARTICIPANT_FINISHED" - The participant finished playing in the match.
    * - "PARTICIPANT_UNRESPONSIVE" - The participant did not take their turn in the allotted time.
    */
  var status: js.UndefOr[String] = js.native
}

object TurnBasedMatchParticipant {
  @scala.inline
  def apply(): TurnBasedMatchParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurnBasedMatchParticipant]
  }
  @scala.inline
  implicit class TurnBasedMatchParticipantOps[Self <: TurnBasedMatchParticipant] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
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

