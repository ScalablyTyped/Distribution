package typings.firebaseFirestore.specsSpecTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotEvent extends js.Object {
  var added: js.UndefOr[js.Array[SpecDocument]] = js.undefined
  var errorCode: js.UndefOr[Double] = js.undefined
  var fromCache: js.UndefOr[Boolean] = js.undefined
  var hasPendingWrites: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[js.Array[SpecDocument]] = js.undefined
  var modified: js.UndefOr[js.Array[SpecDocument]] = js.undefined
  var query: SpecQuery
  var removed: js.UndefOr[js.Array[SpecDocument]] = js.undefined
}

object SnapshotEvent {
  @scala.inline
  def apply(
    query: SpecQuery,
    added: js.Array[SpecDocument] = null,
    errorCode: Int | Double = null,
    fromCache: js.UndefOr[Boolean] = js.undefined,
    hasPendingWrites: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Array[SpecDocument] = null,
    modified: js.Array[SpecDocument] = null,
    removed: js.Array[SpecDocument] = null
  ): SnapshotEvent = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (!js.isUndefined(fromCache)) __obj.updateDynamic("fromCache")(fromCache.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPendingWrites)) __obj.updateDynamic("hasPendingWrites")(hasPendingWrites.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotEvent]
  }
}

