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

object BackupRunsListResponse {
  @scala.inline
  def apply(
    items: js.Array[BackupRun] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): BackupRunsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[BackupRunsListResponse]
  }
}

