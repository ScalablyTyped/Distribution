package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for turn-based match modification metadata.
  */
@js.native
trait Schema$TurnBasedMatchModification extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchModification.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp at which they modified the match, in milliseconds since the
    * epoch in UTC.
    */
  var modifiedTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The ID of the participant that modified the match.
    */
  var participantId: js.UndefOr[String] = js.native
}

object Schema$TurnBasedMatchModification {
  @scala.inline
  def apply(kind: String = null, modifiedTimestampMillis: String = null, participantId: String = null): Schema$TurnBasedMatchModification = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modifiedTimestampMillis != null) __obj.updateDynamic("modifiedTimestampMillis")(modifiedTimestampMillis.asInstanceOf[js.Any])
    if (participantId != null) __obj.updateDynamic("participantId")(participantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TurnBasedMatchModification]
  }
}

