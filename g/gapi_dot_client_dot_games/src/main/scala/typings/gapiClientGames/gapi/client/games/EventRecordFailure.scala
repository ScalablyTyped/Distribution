package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRecordFailure extends js.Object {
  /** The ID of the event that was not updated. */
  var eventId: js.UndefOr[String] = js.undefined
  /**
    * The cause for the update failure.
    * Possible values are:
    * - "NOT_FOUND" - An attempt was made to set an event that was not defined.
    * - "INVALID_UPDATE_VALUE" - An attempt was made to increment an event by a non-positive value.
    */
  var failureCause: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventRecordFailure. */
  var kind: js.UndefOr[String] = js.undefined
}

object EventRecordFailure {
  @scala.inline
  def apply(eventId: String = null, failureCause: String = null, kind: String = null): EventRecordFailure = {
    val __obj = js.Dynamic.literal()
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (failureCause != null) __obj.updateDynamic("failureCause")(failureCause.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRecordFailure]
  }
}

