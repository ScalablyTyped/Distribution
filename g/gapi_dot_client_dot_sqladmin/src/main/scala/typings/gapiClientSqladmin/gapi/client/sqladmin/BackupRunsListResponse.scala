package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRunsListResponse extends js.Object {
  /** A list of backup runs in reverse chronological order of the enqueued time. */
  var items: js.UndefOr[js.Array[BackupRun]] = js.undefined
  /** This is always sql#backupRunsList. */
  var kind: js.UndefOr[String] = js.undefined
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object BackupRunsListResponse {
  @scala.inline
  def apply(items: js.Array[BackupRun] = null, kind: String = null, nextPageToken: String = null): BackupRunsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupRunsListResponse]
  }
}

