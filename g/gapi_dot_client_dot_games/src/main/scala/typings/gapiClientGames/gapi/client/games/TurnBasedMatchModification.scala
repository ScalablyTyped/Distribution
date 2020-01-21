package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchModification extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchModification. */
  var kind: js.UndefOr[String] = js.undefined
  /** The timestamp at which they modified the match, in milliseconds since the epoch in UTC. */
  var modifiedTimestampMillis: js.UndefOr[String] = js.undefined
  /** The ID of the participant that modified the match. */
  var participantId: js.UndefOr[String] = js.undefined
}

object TurnBasedMatchModification {
  @scala.inline
  def apply(kind: String = null, modifiedTimestampMillis: String = null, participantId: String = null): TurnBasedMatchModification = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modifiedTimestampMillis != null) __obj.updateDynamic("modifiedTimestampMillis")(modifiedTimestampMillis.asInstanceOf[js.Any])
    if (participantId != null) __obj.updateDynamic("participantId")(participantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnBasedMatchModification]
  }
}

