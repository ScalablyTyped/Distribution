package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a rematch response.
  */
@js.native
trait Schema$TurnBasedMatchRematch extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchRematch.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The old match that the rematch was created from; will be updated such
    * that the rematchId field will point at the new match.
    */
  var previousMatch: js.UndefOr[Schema$TurnBasedMatch] = js.native
  /**
    * The newly created match; a rematch of the old match with the same
    * participants.
    */
  var rematch: js.UndefOr[Schema$TurnBasedMatch] = js.native
}

object Schema$TurnBasedMatchRematch {
  @scala.inline
  def apply(
    kind: String = null,
    previousMatch: Schema$TurnBasedMatch = null,
    rematch: Schema$TurnBasedMatch = null
  ): Schema$TurnBasedMatchRematch = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (previousMatch != null) __obj.updateDynamic("previousMatch")(previousMatch.asInstanceOf[js.Any])
    if (rematch != null) __obj.updateDynamic("rematch")(rematch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TurnBasedMatchRematch]
  }
}

