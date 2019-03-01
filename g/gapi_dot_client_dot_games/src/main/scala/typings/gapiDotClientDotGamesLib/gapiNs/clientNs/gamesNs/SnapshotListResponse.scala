package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotListResponse extends js.Object {
  /** The snapshots. */
  var items: js.UndefOr[js.Array[Snapshot]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#snapshotListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token corresponding to the next page of results. If there are no more results, the token is omitted. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object SnapshotListResponse {
  @scala.inline
  def apply(
    items: js.Array[Snapshot] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): SnapshotListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[SnapshotListResponse]
  }
}

