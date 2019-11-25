package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchCreateRequest extends js.Object {
  /** Criteria for auto-matching players into this match. */
  var autoMatchingCriteria: js.UndefOr[TurnBasedAutoMatchingCriteria] = js.undefined
  /** The player ids to invite to the match. */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchCreateRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** A randomly generated numeric ID. This number is used at the server to ensure that the request is handled correctly across retries. */
  var requestId: js.UndefOr[String] = js.undefined
  /**
    * The variant / mode of the application to be played. This can be any integer value, or left blank. You should use a small number of variants to keep the
    * auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.undefined
}

object TurnBasedMatchCreateRequest {
  @scala.inline
  def apply(
    autoMatchingCriteria: TurnBasedAutoMatchingCriteria = null,
    invitedPlayerIds: js.Array[String] = null,
    kind: String = null,
    requestId: String = null,
    variant: Int | Double = null
  ): TurnBasedMatchCreateRequest = {
    val __obj = js.Dynamic.literal()
    if (autoMatchingCriteria != null) __obj.updateDynamic("autoMatchingCriteria")(autoMatchingCriteria.asInstanceOf[js.Any])
    if (invitedPlayerIds != null) __obj.updateDynamic("invitedPlayerIds")(invitedPlayerIds.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnBasedMatchCreateRequest]
  }
}

