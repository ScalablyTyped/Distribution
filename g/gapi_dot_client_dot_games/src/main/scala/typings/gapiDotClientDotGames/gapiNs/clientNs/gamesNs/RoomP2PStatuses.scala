package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomP2PStatuses extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomP2PStatuses. */
  var kind: js.UndefOr[String] = js.undefined
  /** The updates for the peers. */
  var updates: js.UndefOr[js.Array[RoomP2PStatus]] = js.undefined
}

object RoomP2PStatuses {
  @scala.inline
  def apply(kind: String = null, updates: js.Array[RoomP2PStatus] = null): RoomP2PStatuses = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (updates != null) __obj.updateDynamic("updates")(updates)
    __obj.asInstanceOf[RoomP2PStatuses]
  }
}

