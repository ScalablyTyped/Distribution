package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for room modification metadata.
  */
@js.native
trait Schema$RoomModification extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomModification.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp at which they modified the room, in milliseconds since the
    * epoch in UTC.
    */
  var modifiedTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The ID of the participant that modified the room.
    */
  var participantId: js.UndefOr[String] = js.native
}

object Schema$RoomModification {
  @scala.inline
  def apply(kind: String = null, modifiedTimestampMillis: String = null, participantId: String = null): Schema$RoomModification = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modifiedTimestampMillis != null) __obj.updateDynamic("modifiedTimestampMillis")(modifiedTimestampMillis.asInstanceOf[js.Any])
    if (participantId != null) __obj.updateDynamic("participantId")(participantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoomModification]
  }
}

