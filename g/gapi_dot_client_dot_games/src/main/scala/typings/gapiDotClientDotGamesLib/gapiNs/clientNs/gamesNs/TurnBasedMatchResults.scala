package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchResults extends js.Object {
  /** The final match data. */
  var data: js.UndefOr[TurnBasedMatchDataRequest] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchResults. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the match being updated. */
  var matchVersion: js.UndefOr[scala.Double] = js.undefined
  /** The match results for the participants in the match. */
  var results: js.UndefOr[js.Array[ParticipantResult]] = js.undefined
}

object TurnBasedMatchResults {
  @scala.inline
  def apply(
    data: TurnBasedMatchDataRequest = null,
    kind: java.lang.String = null,
    matchVersion: scala.Int | scala.Double = null,
    results: js.Array[ParticipantResult] = null
  ): TurnBasedMatchResults = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (matchVersion != null) __obj.updateDynamic("matchVersion")(matchVersion.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[TurnBasedMatchResults]
  }
}

