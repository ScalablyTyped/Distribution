package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for multiple events reset all request.
  */
@js.native
trait Schema$EventsResetMultipleForAllRequest extends js.Object {
  /**
    * The IDs of events to reset.
    */
  var event_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#eventsResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$EventsResetMultipleForAllRequest {
  @scala.inline
  def apply(event_ids: js.Array[String] = null, kind: String = null): Schema$EventsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (event_ids != null) __obj.updateDynamic("event_ids")(event_ids.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventsResetMultipleForAllRequest]
  }
}

