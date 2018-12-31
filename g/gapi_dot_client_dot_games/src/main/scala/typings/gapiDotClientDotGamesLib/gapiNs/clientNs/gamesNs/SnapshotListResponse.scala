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

