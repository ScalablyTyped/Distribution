package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchRematch extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchRematch. */
  var kind: js.UndefOr[String] = js.undefined
  /** The old match that the rematch was created from; will be updated such that the rematchId field will point at the new match. */
  var previousMatch: js.UndefOr[TurnBasedMatch] = js.undefined
  /** The newly created match; a rematch of the old match with the same participants. */
  var rematch: js.UndefOr[TurnBasedMatch] = js.undefined
}

object TurnBasedMatchRematch {
  @scala.inline
  def apply(kind: String = null, previousMatch: TurnBasedMatch = null, rematch: TurnBasedMatch = null): TurnBasedMatchRematch = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (previousMatch != null) __obj.updateDynamic("previousMatch")(previousMatch.asInstanceOf[js.Any])
    if (rematch != null) __obj.updateDynamic("rematch")(rematch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnBasedMatchRematch]
  }
}

