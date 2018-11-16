package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventUpdateResponse extends js.Object {
  /** Any batch-wide failures which occurred applying updates. */
  var batchFailures: js.UndefOr[js.Array[EventBatchRecordFailure]] = js.undefined
  /** Any failures updating a particular event. */
  var eventFailures: js.UndefOr[js.Array[EventRecordFailure]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventUpdateResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The current status of any updated events */
  var playerEvents: js.UndefOr[js.Array[PlayerEvent]] = js.undefined
}

