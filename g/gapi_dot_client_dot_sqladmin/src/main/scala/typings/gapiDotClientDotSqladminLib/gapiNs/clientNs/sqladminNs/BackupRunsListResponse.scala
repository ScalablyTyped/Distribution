package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BackupRunsListResponse extends js.Object {
  /** A list of backup runs in reverse chronological order of the enqueued time. */
  var items: js.UndefOr[js.Array[BackupRun]] = js.undefined
  /** This is always sql#backupRunsList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

