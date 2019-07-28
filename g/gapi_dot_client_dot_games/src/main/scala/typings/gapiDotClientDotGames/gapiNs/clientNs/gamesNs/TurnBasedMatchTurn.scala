package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchTurn extends js.Object {
  /** The shared game state data after the turn is over. */
  var data: js.UndefOr[TurnBasedMatchDataRequest] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchTurn. */
  var kind: js.UndefOr[String] = js.undefined
  /** The version of this match: an increasing counter, used to avoid out-of-date updates to the match. */
  var matchVersion: js.UndefOr[Double] = js.undefined
  /**
    * The ID of the participant who should take their turn next. May be set to the current player's participant ID to update match state without changing the
    * turn. If not set, the match will wait for other player(s) to join via automatching; this is only valid if automatch criteria is set on the match with
    * remaining slots for automatched players.
    */
  var pendingParticipantId: js.UndefOr[String] = js.undefined
  /** The match results for the participants in the match. */
  var results: js.UndefOr[js.Array[ParticipantResult]] = js.undefined
}

object TurnBasedMatchTurn {
  @scala.inline
  def apply(
    data: TurnBasedMatchDataRequest = null,
    kind: String = null,
    matchVersion: Int | Double = null,
    pendingParticipantId: String = null,
    results: js.Array[ParticipantResult] = null
  ): TurnBasedMatchTurn = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (matchVersion != null) __obj.updateDynamic("matchVersion")(matchVersion.asInstanceOf[js.Any])
    if (pendingParticipantId != null) __obj.updateDynamic("pendingParticipantId")(pendingParticipantId)
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[TurnBasedMatchTurn]
  }
}

