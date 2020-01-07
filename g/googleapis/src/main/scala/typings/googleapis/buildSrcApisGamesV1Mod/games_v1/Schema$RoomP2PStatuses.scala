package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an update on the status of peers in a room.
  */
@js.native
trait Schema$RoomP2PStatuses extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomP2PStatuses.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The updates for the peers.
    */
  var updates: js.UndefOr[js.Array[Schema$RoomP2PStatus]] = js.native
}

object Schema$RoomP2PStatuses {
  @scala.inline
  def apply(kind: String = null, updates: js.Array[Schema$RoomP2PStatus] = null): Schema$RoomP2PStatuses = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoomP2PStatuses]
  }
}

