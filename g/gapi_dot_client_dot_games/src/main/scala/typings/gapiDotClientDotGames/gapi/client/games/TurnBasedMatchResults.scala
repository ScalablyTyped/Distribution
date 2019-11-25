package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchResults extends js.Object {
  /** The final match data. */
  var data: js.UndefOr[TurnBasedMatchDataRequest] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchResults. */
  var kind: js.UndefOr[String] = js.undefined
  /** The version of the match being updated. */
  var matchVersion: js.UndefOr[Double] = js.undefined
  /** The match results for the participants in the match. */
  var results: js.UndefOr[js.Array[ParticipantResult]] = js.undefined
}

object TurnBasedMatchResults {
  @scala.inline
  def apply(
    data: TurnBasedMatchDataRequest = null,
    kind: String = null,
    matchVersion: Int | Double = null,
    results: js.Array[ParticipantResult] = null
  ): TurnBasedMatchResults = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (matchVersion != null) __obj.updateDynamic("matchVersion")(matchVersion.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnBasedMatchResults]
  }
}

