package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResetMultipleForAllRequest extends js.Object {
  /** The IDs of events to reset. */
  var event_ids: js.UndefOr[js.Array[String]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#eventsResetMultipleForAllRequest. */
  var kind: js.UndefOr[String] = js.undefined
}

object EventsResetMultipleForAllRequest {
  @scala.inline
  def apply(event_ids: js.Array[String] = null, kind: String = null): EventsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (event_ids != null) __obj.updateDynamic("event_ids")(event_ids.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsResetMultipleForAllRequest]
  }
}

