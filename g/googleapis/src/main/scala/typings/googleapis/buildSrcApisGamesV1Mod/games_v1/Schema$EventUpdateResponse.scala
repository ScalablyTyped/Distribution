package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait Schema$EventUpdateResponse extends js.Object {
  /**
    * Any batch-wide failures which occurred applying updates.
    */
  var batchFailures: js.UndefOr[js.Array[Schema$EventBatchRecordFailure]] = js.native
  /**
    * Any failures updating a particular event.
    */
  var eventFailures: js.UndefOr[js.Array[Schema$EventRecordFailure]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventUpdateResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current status of any updated events
    */
  var playerEvents: js.UndefOr[js.Array[Schema$PlayerEvent]] = js.native
}

object Schema$EventUpdateResponse {
  @scala.inline
  def apply(
    batchFailures: js.Array[Schema$EventBatchRecordFailure] = null,
    eventFailures: js.Array[Schema$EventRecordFailure] = null,
    kind: String = null,
    playerEvents: js.Array[Schema$PlayerEvent] = null
  ): Schema$EventUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (batchFailures != null) __obj.updateDynamic("batchFailures")(batchFailures.asInstanceOf[js.Any])
    if (eventFailures != null) __obj.updateDynamic("eventFailures")(eventFailures.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (playerEvents != null) __obj.updateDynamic("playerEvents")(playerEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventUpdateResponse]
  }
}

