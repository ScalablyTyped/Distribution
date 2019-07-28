package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventUpdateRequest extends js.Object {
  /** The ID of the event being modified in this update. */
  var definitionId: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventUpdateRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** The number of times this event occurred in this time period. */
  var updateCount: js.UndefOr[String] = js.undefined
}

object EventUpdateRequest {
  @scala.inline
  def apply(definitionId: String = null, kind: String = null, updateCount: String = null): EventUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (definitionId != null) __obj.updateDynamic("definitionId")(definitionId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount)
    __obj.asInstanceOf[EventUpdateRequest]
  }
}

