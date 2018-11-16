package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TurnBasedMatchParticipant extends js.Object {
  /** True if this participant was auto-matched with the requesting player. */
  var autoMatched: js.UndefOr[scala.Boolean] = js.undefined
  /** Information about a player that has been anonymously auto-matched against the requesting player. (Either player or autoMatchedPlayer will be set.) */
  var autoMatchedPlayer: js.UndefOr[AnonymousPlayer] = js.undefined
  /** An identifier for the participant in the scope of the match. Cannot be used to identify a player across matches or in other contexts. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchParticipant. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Information about the player. Not populated if this player was anonymously auto-matched against the requesting player. (Either player or
               * autoMatchedPlayer will be set.)
               */
  var player: js.UndefOr[Player] = js.undefined
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
  var status: js.UndefOr[java.lang.String] = js.undefined
}

