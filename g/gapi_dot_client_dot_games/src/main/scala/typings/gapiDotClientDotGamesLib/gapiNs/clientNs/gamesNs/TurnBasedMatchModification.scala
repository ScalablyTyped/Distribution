package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchModification extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchModification. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp at which they modified the match, in milliseconds since the epoch in UTC. */
  var modifiedTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the participant that modified the match. */
  var participantId: js.UndefOr[java.lang.String] = js.undefined
}

object TurnBasedMatchModification {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    modifiedTimestampMillis: java.lang.String = null,
    participantId: java.lang.String = null
  ): TurnBasedMatchModification = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (modifiedTimestampMillis != null) __obj.updateDynamic("modifiedTimestampMillis")(modifiedTimestampMillis)
    if (participantId != null) __obj.updateDynamic("participantId")(participantId)
    __obj.asInstanceOf[TurnBasedMatchModification]
  }
}

